package com.ucb.bo.ToxicChat.dto;

public class Comprehend {
    private Double positive;
    private Double negative;
    private Double neutral;
    private Double mixed;


    public Comprehend(Double positive, Double negative, Double neutral, Double mixed) {
        this.positive = positive;
        this.negative = negative;
        this.neutral = neutral;
        this.mixed = mixed;
    }

    public Comprehend() {
    }

    @Override
    public String toString() {
        return "Comprehend{" +
                "positive=" + positive +
                ", negative=" + negative +
                ", neutral=" + neutral +
                ", mixed=" + mixed +
                '}';
    }

    public Double getPositive() {
        return positive;
    }

    public void setPositive(Double positive) {
        this.positive = positive;
    }

    public Double getNegative() {
        return negative;
    }

    public void setNegative(Double negative) {
        this.negative = negative;
    }

    public Double getNeutral() {
        return neutral;
    }

    public void setNeutral(Double neutral) {
        this.neutral = neutral;
    }

    public Double getMixed() {
        return mixed;
    }

    public void setMixed(Double mixed) {
        this.mixed = mixed;
    }
}
