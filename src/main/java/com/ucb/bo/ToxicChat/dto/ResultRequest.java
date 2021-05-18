package com.ucb.bo.ToxicChat.dto;

import com.amazonaws.services.comprehend.model.Entity;
import com.amazonaws.services.comprehend.model.KeyPhrase;
import com.amazonaws.services.comprehend.model.SentimentScore;
import java.util.List;

public class ResultRequest {
    private SentimentScore sentiment;
    private List<Entity> entity;
    private List<KeyPhrase> keyPhrases;

    public ResultRequest() {
    }

    public SentimentScore getSentiment() {
        return sentiment;
    }

    public void setSentiment(SentimentScore sentiment) {
        this.sentiment = sentiment;
    }

    public List<Entity> getEntity() {
        return entity;
    }

    public void setEntity(List<Entity> entity) {
        this.entity = entity;
    }

    public List<KeyPhrase> getKeyPhrases() {
        return keyPhrases;
    }

    public void setKeyPhrases(List<KeyPhrase> keyPhrases) {
        this.keyPhrases = keyPhrases;
    }
}
