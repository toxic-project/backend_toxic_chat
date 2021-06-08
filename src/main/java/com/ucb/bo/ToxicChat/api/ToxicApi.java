package com.ucb.bo.ToxicChat.api;

import com.amazonaws.services.comprehend.model.Entity;
import com.ucb.bo.ToxicChat.dto.Comprehend;
import com.ucb.bo.ToxicChat.dto.Entities;
import com.ucb.bo.ToxicChat.dto.ResultsResponse;
import com.ucb.bo.ToxicChat.dto.TextRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping(value = "toxic")
public class ToxicApi {
    private static final Logger log = LoggerFactory.getLogger(ComprehendApi.class);

    @RequestMapping(value = "/chat/text", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResultsResponse detectEntitiesWithComprehend(@RequestBody TextRequest text, HttpServletRequest request) {
//        log.debug("Method to Detect Entities With Amazon Comprehend");
//        Transactions transaction = TransactionUtil.createTransaction(request);
//        transactionBl.createTransaction(transaction);
        Comprehend comprehend = new Comprehend(0.32, 0.13, 0.54, 0.25);
        Entities entities = new Entities(0.8, "PERSON", "pex");

        return new ResultsResponse(entities, comprehend);
    }
}
