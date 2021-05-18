package com.ucb.bo.ToxicChat.dao;

import com.amazonaws.services.comprehend.model.SentimentScore;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ResultsDao {
    void savesentiment(SentimentScore sentimentScore);
}
