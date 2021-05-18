package com.ucb.bo.ToxicChat.bl;
import com.ucb.bo.ToxicChat.dao.ResultsDao;
import com.ucb.bo.ToxicChat.dto.ResultRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultsBl {
    private ResultsDao resultsDao;

    @Autowired
    public ResultsBl(ResultsDao resultsDao) {
        this.resultsDao = resultsDao;
    }

    public void saveresults(ResultRequest sentiment) {
        resultsDao.savesentiment(sentiment.getSentiment());
    }
}
