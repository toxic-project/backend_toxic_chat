package com.ucb.bo.ToxicChat.bl;

import com.ucb.bo.ToxicChat.dao.FAQDao;
import com.ucb.bo.ToxicChat.dto.FAQResponse;
import com.ucb.bo.ToxicChat.model.FrequentAskedQuestion;
import com.ucb.bo.ToxicChat.model.Transactions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FAQBl {
    private FAQDao faqDao;

    @Autowired
    public FAQBl(FAQDao faqDao) {
        this.faqDao = faqDao;
    }

    public List<FAQResponse> getFAQs() {
        return faqDao.getAllFAQs();
    }

    public FrequentAskedQuestion addNewFAQ(FAQResponse newFAQ, Transactions transaction) {
        FrequentAskedQuestion frequentAskedQuestion = new FrequentAskedQuestion();
        frequentAskedQuestion.setQuestion(newFAQ.getQuestion());
        frequentAskedQuestion.setAnswer(newFAQ.getAnswer());
        frequentAskedQuestion.setTxId(transaction.getTxId());
        frequentAskedQuestion.setTxHost(transaction.getTxHost());
        frequentAskedQuestion.setTxUserId(1);
        frequentAskedQuestion.setTxDate(transaction.getTxDate());
        faqDao.addNewFAQ(frequentAskedQuestion);
        return frequentAskedQuestion;
    }
}