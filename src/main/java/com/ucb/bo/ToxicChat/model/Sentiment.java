package com.ucb.bo.ToxicChat.model;

public class Sentiment {
    private Integer idSentiment;
    private Float positive;
    private Float negative;
    private Float neutral;
    private Float mixed;

    public Sentiment() {
    }

    public Sentiment(Integer idSentiment, Float positive, Float negative, Float neutral, Float mixed) {
        this.idSentiment = idSentiment;
        this.positive = positive;
        this.negative = negative;
        this.neutral = neutral;
        this.mixed = mixed;
    }

    @Override
    public String toString() {
        return "Sentiment{" +
                "idSentiment=" + idSentiment +
                ", positive=" + positive +
                ", negative=" + negative +
                ", neutral=" + neutral +
                ", mixed=" + mixed +
                '}';
    }

    public Integer getIdSentiment() {
        return idSentiment;
    }

    public void setIdSentiment(Integer idSentiment) {
        this.idSentiment = idSentiment;
    }

    public Float getPositive() {
        return positive;
    }

    public void setPositive(Float positive) {
        this.positive = positive;
    }

    public Float getNegative() {
        return negative;
    }

    public void setNegative(Float negative) {
        this.negative = negative;
    }

    public Float getNeutral() {
        return neutral;
    }

    public void setNeutral(Float neutral) {
        this.neutral = neutral;
    }

    public Float getMixed() {
        return mixed;
    }

    public void setMixed(Float mixed) {
        this.mixed = mixed;
    }
}
