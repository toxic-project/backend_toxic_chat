package com.ucb.bo.ToxicChat.bl;

import com.ucb.bo.ToxicChat.dao.FAQDao;
import com.ucb.bo.ToxicChat.dto.FAQResponse;
import com.ucb.bo.ToxicChat.model.FrequentAnswerQuestion;
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

    public FrequentAnswerQuestion addNewFAQ(FAQResponse newFAQ, Transactions transaction) {
        FrequentAnswerQuestion frequentAnswerQuestion = new FrequentAnswerQuestion();
        frequentAnswerQuestion.setQuestion(newFAQ.getQuestion());
        frequentAnswerQuestion.setAnswer(newFAQ.getAnswer());
        frequentAnswerQuestion.setTxId(transaction.getTxId());
        frequentAnswerQuestion.setTxHost(transaction.getTxHost());
        frequentAnswerQuestion.setTxUserId(1);
        frequentAnswerQuestion.setTxDate(transaction.getTxDate());
        faqDao.addNewFAQ(frequentAnswerQuestion);
        return frequentAnswerQuestion;
    }
}
