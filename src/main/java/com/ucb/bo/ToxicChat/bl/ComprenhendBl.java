package com.ucb.bo.ToxicChat.bl;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.comprehend.AmazonComprehend;
import com.amazonaws.services.comprehend.AmazonComprehendClientBuilder;
import com.amazonaws.services.comprehend.model.*;
import com.ucb.bo.ToxicChat.dao.ComprenhendDao;
import com.ucb.bo.ToxicChat.dto.MessageResponse;
import com.ucb.bo.ToxicChat.dto.MessagesRequest;
import com.ucb.bo.ToxicChat.dto.TextRequest;
import com.ucb.bo.ToxicChat.util.ClassificationMessages;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@Service
public class ComprenhendBl {
    private ComprenhendDao comprenhendDao;
    private ClassificationMessages classificationMessages;
    private static final Logger log = LoggerFactory.getLogger(ComprenhendBl.class);

    @Autowired
    public ComprenhendBl(ComprenhendDao comprenhendDao, ClassificationMessages classificationMessages) {
        this.comprenhendDao = comprenhendDao;
        this.classificationMessages = classificationMessages;
    }
    public List<MessageResponse> sentimentPerMessages(List<MessagesRequest> messagesRequests){
        List<MessageResponse> messagesResponse = new ArrayList<>();
        messagesRequests.forEach(value -> {
            MessageResponse message= new MessageResponse();
            TextRequest text= new TextRequest();
            text.setText(value.getMessages());
            SentimentScore sentimentresult = detectsentiment(text);
            message.setMessages(value.getMessages());
            message.setDate(value.getDate());
            message.setFrom(value.getFrom());
            message.setEmoticon(classificationMessages.compareSentimentResult(sentimentresult));
            message.setColoremoticon(classificationMessages.compareSentimentResultColor(sentimentresult));
            messagesResponse.add(message);
        });

        return  messagesResponse;
    }

    public List<Entity> detecentities(TextRequest textRequest) {
        DetectEntitiesRequest detectEntitiesRequest = new DetectEntitiesRequest().withText(trimByBytes(textRequest.getText(), 5000))
                .withLanguageCode("es");
        log.info(detectEntitiesRequest.toString());
        DetectEntitiesResult detectEntitiesResult = comprehendClient().detectEntities(detectEntitiesRequest);
        return detectEntitiesResult.getEntities();
    }

    public SentimentScore detectsentiment(TextRequest textRequest) {
        DetectSentimentRequest detectSentimentRequest = new DetectSentimentRequest().withText(trimByBytes(textRequest.getText(), 5000))
                .withLanguageCode("es");
        DetectSentimentResult detectSentimentResult = comprehendClient().detectSentiment(detectSentimentRequest);
        return detectSentimentResult.getSentimentScore();
    }
    public List<KeyPhrase> detectContext(TextRequest textRequest){
        DetectKeyPhrasesRequest detectKeyPhrasesRequest = new DetectKeyPhrasesRequest().withText(trimByBytes(textRequest.getText(), 5000))
                .withLanguageCode("es");
        DetectKeyPhrasesResult detectKeyPhrasesResult= comprehendClient().detectKeyPhrases(detectKeyPhrasesRequest);
        return detectKeyPhrasesResult.getKeyPhrases();
    }

    /************* Step 2 *******************
     ** Initialize Amazon Comprehend Client
     **************************************/
    AmazonComprehend comprehendClient() {
        BasicAWSCredentials awsCreds = new BasicAWSCredentials("AKIASTMWE3ADLTB7A4KE", "1+sTOnPPVwb4dooGPe8aX/QH4zwVE7Buu6miRRDu");
        AWSStaticCredentialsProvider awsStaticCredentialsProvider = new AWSStaticCredentialsProvider(awsCreds);
        return AmazonComprehendClientBuilder.standard().withCredentials(awsStaticCredentialsProvider)
                .withRegion("us-east-2").build();
    }

    String trimByBytes(String str, int lengthOfBytes) {
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
