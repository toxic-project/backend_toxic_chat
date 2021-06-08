package com.ucb.bo.ToxicChat.api;

import com.ucb.bo.ToxicChat.bl.ResultsBl;
import com.ucb.bo.ToxicChat.dto.ResultsResponse;
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

@RestController
@RequestMapping(value = "toxic")
public class ToxicApi {
    private static final Logger log = LoggerFactory.getLogger(ComprehendApi.class);
    private final ResultsBl resultsBl;

    @Autowired
    public ToxicApi(ResultsBl resultsBl) {
        this.resultsBl = resultsBl;
    }


    @RequestMapping(value = "/chat/text", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResultsResponse detectEntitiesWithComprehend(@RequestBody TextRequest text, HttpServletRequest request) {
//        log.debug("Method to Detect Entities With Amazon Comprehend");
        Transactions transaction = TransactionUtil.createTransaction(request);
//        transactionBl.createTransaction(transaction);
        return resultsBl.processText(text, transaction);
    }
}
