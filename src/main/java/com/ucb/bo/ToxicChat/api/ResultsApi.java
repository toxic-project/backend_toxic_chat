package com.ucb.bo.ToxicChat.api;

import com.amazonaws.services.comprehend.model.Entity;
import com.amazonaws.services.comprehend.model.SentimentScore;
import com.ucb.bo.ToxicChat.bl.ResultsBl;
import com.ucb.bo.ToxicChat.dto.ResultRequest;
import com.ucb.bo.ToxicChat.dto.TextRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping(value = "/results")
public class ResultsApi {
    private ResultsBl resultsBl;

    @Autowired
    public ResultsApi(ResultsBl resultsBl) {
        this.resultsBl = resultsBl;
    }

    @RequestMapping(value = "/user/{userId}", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void saveresultSentiment(@RequestBody ResultRequest resultRequest, HttpServletRequest request) {
        resultsBl.saveresults(resultRequest);
    }

}
