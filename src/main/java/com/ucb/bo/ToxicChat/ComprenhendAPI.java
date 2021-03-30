package com.ucb.bo.ToxicChat;
/***** Step 1 Imports *********/
import com.amazonaws.SdkClientException;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder.EndpointConfiguration;

import com.amazonaws.services.comprehend.AmazonComprehend;
import com.amazonaws.services.comprehend.AmazonComprehendClientBuilder;
import com.amazonaws.services.comprehend.model.DetectEntitiesRequest;
import com.amazonaws.services.comprehend.model.DetectEntitiesResult;
import com.amazonaws.services.comprehend.model.Entity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.util.*;

@RestController
@RequestMapping(value = "")
public class ComprenhendAPI {
    private static final Logger log = LoggerFactory.getLogger(ComprenhendAPI.class);

    /************* Step 2 *******************
     ** Initialize Amazon Comprehend Client
     **************************************/
    AmazonComprehend comprehendClient() {
        log.debug("Intialize Comprehend Client");
        BasicAWSCredentials awsCreds = new BasicAWSCredentials("AKIASTMWE3ADDPVRAENY", "vXno00zzcpfP4i/HPw4lVBkbnLnUQS9P9rnvzD21");
        AWSStaticCredentialsProvider awsStaticCredentialsProvider = new AWSStaticCredentialsProvider(awsCreds);
        return AmazonComprehendClientBuilder.standard().withCredentials(awsStaticCredentialsProvider)
                .withRegion("us-east-2").build();
    }

    /*****************Step 3**************
     ** Call Detect entities method **********/

    @RequestMapping(value = "/hola",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Entity> detectEntitiesWithComprehend(String text) {
//        log.debug("Method to Detect Entities With Amazon Comprehend {}", blocksList.get(0));
        log.debug("Method to Detect Entities With Amazon Comprehend {}");
        text = trimByBytes("Hello Zhang Wei. Your AnyCompany Financial Services, LLC credit card account 1111-0000-1111-0000 has a minimum payment of $24.53 that is due by July 31st. Based on your autopay settings, we will withdraw your payment on the due date from your bank account XXXXXX1111 with the routing number XXXXX0000. \n" +
                "\n" +
                "Your latest statement was mailed to 100 Main Street, Anytown, WA 98121. \n" +
                "After your payment is received, you will receive a confirmation text message at 206-555-0100. \n" +
                "If you have questions about your bill, AnyCompany Customer Service is available by phone at 206-555-0199 or email at support@anycompany.com.", 5000);
        DetectEntitiesRequest detectEntitiesRequest = new DetectEntitiesRequest().withText(text)
                .withLanguageCode("en");
        DetectEntitiesResult detectEntitiesResult = comprehendClient().detectEntities(detectEntitiesRequest);
        List<Entity> entitiesList = detectEntitiesResult.getEntities();
        return entitiesList;
    }

    // Method to trim text to 500 bytes as Comprehend Sync Api Limit
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
