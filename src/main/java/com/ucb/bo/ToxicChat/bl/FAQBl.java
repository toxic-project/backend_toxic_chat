package com.ucb.bo.ToxicChat.bl;

import com.ucb.bo.ToxicChat.dao.FAQDao;
import com.ucb.bo.ToxicChat.dto.FAQResponse;
import com.ucb.bo.ToxicChat.model.Answers;
import com.ucb.bo.ToxicChat.model.FrequentAskedQuestion;
import com.ucb.bo.ToxicChat.model.Transactions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

@Service
public class FAQBl {
    private FAQDao faqDao;
    private static final Logger log = LoggerFactory.getLogger(FAQBl.class);

    @Autowired
    public FAQBl(FAQDao faqDao) {
        this.faqDao = faqDao;
    }

    public List<FAQResponse> getFAQs() {
        List<FAQResponse> faqResponses = faqDao.getAllFAQs();
        List<FAQResponse> result = new ArrayList<>();
        faqResponses.forEach(faqResponse -> {
            List<Answers> answers = faqDao.getAnswersByFAQId(faqResponse.getIdFaq());
            faqResponse.setAnswer(answers);
            log.warn(faqResponse.toString());
            result.add(faqResponse);
        });
        return result;
    }

    public FrequentAskedQuestion addNewFAQ(FAQResponse newFAQ, Transactions transaction) {
        FrequentAskedQuestion frequentAskedQuestion = new FrequentAskedQuestion();
        frequentAskedQuestion.setQuestion(newFAQ.getQuestion());
        frequentAskedQuestion.setTxId(transaction.getTxId());
        frequentAskedQuestion.setTxHost(transaction.getTxHost());
        frequentAskedQuestion.setTxUserId(1);
        frequentAskedQuestion.setTxDate(transaction.getTxDate());
        faqDao.addNewFAQ(frequentAskedQuestion);
        // TODO Add new answer
        return frequentAskedQuestion;
    }
}