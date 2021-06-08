package com.ucb.bo.ToxicChat.bl;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.comprehend.AmazonComprehend;
import com.amazonaws.services.comprehend.AmazonComprehendClientBuilder;
import com.amazonaws.services.comprehend.model.*;
import com.ucb.bo.ToxicChat.dao.ResultsDao;
import com.ucb.bo.ToxicChat.dto.*;
import com.ucb.bo.ToxicChat.model.Transactions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.util.List;

@Service
public class ResultsBl {
    private final ResultsDao resultsDao;
    private static final Logger log = LoggerFactory.getLogger(ComprenhendBl.class);

    @Autowired
    public ResultsBl(ResultsDao resultsDao) {
        this.resultsDao = resultsDao;
    }

    public void saveresults(ResultRequest sentiment) {
        resultsDao.savesentiment(sentiment.getSentiment());
    }

    public ResultsResponse processText(TextRequest text, Transactions transaction) {

        DetectSentimentRequest detectSentimentRequest = new DetectSentimentRequest().withText(trimByBytes(text.getText(), 5000)).withLanguageCode("es");
        DetectSentimentResult detectSentimentResult = comprehendClient().detectSentiment(detectSentimentRequest);
        SentimentScore sentiment = detectSentimentResult.getSentimentScore();
        Comprehend comprehend = new Comprehend(sentiment.getPositive(), sentiment.getNegative(), sentiment.getNeutral(), sentiment.getMixed());
        Entities entities = new Entities();
        try {
            DetectEntitiesRequest detectEntitiesRequest = new DetectEntitiesRequest().withText(trimByBytes(text.getText(), 5000)).withLanguageCode("es");
            log.info(detectEntitiesRequest.toString());
            DetectEntitiesResult detectEntitiesResult = comprehendClient().detectEntities(detectEntitiesRequest);
            Entity entitiesList = detectEntitiesResult.getEntities().get(0);
            entities = new Entities(entitiesList.getScore(), entitiesList.getType(), entitiesList.getText());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new ResultsResponse(entities, comprehend);
    }

    private AmazonComprehend comprehendClient() {
        BasicAWSCredentials awsCreds = new BasicAWSCredentials(System.getenv("S3_KEY"), System.getenv("S3_SECRET"));
        AWSStaticCredentialsProvider awsStaticCredentialsProvider = new AWSStaticCredentialsProvider(awsCreds);
        return AmazonComprehendClientBuilder.standard().withCredentials(awsStaticCredentialsProvider)
                .withRegion("us-east-2").build();
    }

    private String trimByBytes(String str, int lengthOfBytes) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        ByteBuffer buffer = ByteBuffer.wrap(bytes);

        if (lengthOfBytes < buffer.limit()) {
            buffer.limit(lengthOfBytes);
        }

        CharsetDecoder decoder = StandardCharsets.UTF_8.newDecoder();
        decoder.onMalformedInput(CodingErrorAction.IGNORE);

        try {
            return decoder.decode(buffer).toString();
        } catch (CharacterCodingException e) {
            // We will never get here.
            throw new RuntimeException(e);
        }
    }
}
