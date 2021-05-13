package com.ucb.bo.ToxicChat.dao;

import com.ucb.bo.ToxicChat.dto.FAQResponse;
import com.ucb.bo.ToxicChat.model.Answers;
import com.ucb.bo.ToxicChat.model.FrequentAskedQuestion;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FAQDao {
    // Get list of all FAQs
    public List<FAQResponse> getAllFAQs();

    // Add new faq
    public void addNewFAQ(FrequentAskedQuestion newFAQ);

    List<Answers> getAnswersByFAQId(Integer idFaq);
}
