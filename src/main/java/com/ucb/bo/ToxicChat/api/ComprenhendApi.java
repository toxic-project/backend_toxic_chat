package com.ucb.bo.ToxicChat.api;

import com.amazonaws.services.comprehend.model.Entity;
import com.amazonaws.services.comprehend.model.KeyPhrase;
import com.amazonaws.services.comprehend.model.SentimentScore;
import com.ucb.bo.ToxicChat.bl.ComprenhendBl;
import com.ucb.bo.ToxicChat.bl.TransactionBl;
import com.ucb.bo.ToxicChat.dto.TextRequest;
import com.ucb.bo.ToxicChat.model.Transactions;
import com.ucb.bo.ToxicChat.util.TransactionUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping(value = "")
public class ComprenhendApi {

    private final TransactionBl transactionBl;
    private final ComprenhendBl comprenhendBl;
    private static final Logger log = LoggerFactory.getLogger(ComprenhendApi.class);

    @Autowired
    public ComprenhendApi(TransactionBl transactionBl, ComprenhendBl comprenhendBl) {
        this.transactionBl = transactionBl;
        this.comprenhendBl = comprenhendBl;
    }

    @RequestMapping(value = "/entities", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Entity> detectEntitiesWithComprehend(@RequestBody TextRequest text, HttpServletRequest request) {
        log.debug("Method to Detect Entities With Amazon Comprehend");
//        Transactions transaction = TransactionUtil.createTransaction(request);
//        transactionBl.createTransaction(transaction);
        return comprenhendBl.detecentities(text);

    }

    @RequestMapping(value = "/sentiment", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public SentimentScore detectSentimentsWithComprehend(@RequestBody TextRequest text, HttpServletRequest request) {
        log.debug("Method to Detect Entities With Amazon Comprehend");
//        Transactions transaction = TransactionUtil.createTransaction(request);
//        transactionBl.createTransaction(transaction);
        return comprenhendBl.detectsentiment(text);

    }

    @RequestMapping(value = "/keyphrases", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<KeyPhrase> detectKeyPhrases(@RequestBody TextRequest text, HttpServletRequest request) {
        log.debug("Method to Detect Entities With Amazon Comprehend");
//        Transactions transaction = TransactionUtil.createTransaction(request);
//        transactionBl.createTransaction(transaction);
        return comprenhendBl.detectContext(text);
    }

}
