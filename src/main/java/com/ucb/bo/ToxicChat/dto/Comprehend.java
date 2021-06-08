package com.ucb.bo.ToxicChat.dto;

public class Comprehend {
    private Double positivo;
    private Double negativo;
    private Double neutral;
    private Double mixto;

    public Comprehend(Double positive, Double negativo, Double neutral, Double mixed) {
        this.positivo = positive;
        this.negativo = negativo;
        this.neutral = neutral;
        this.mixto = mixed;
    }

    public Comprehend() {
    }

    @Override
    public String toString() {
        return "Comprehend{" +
                "positive=" + positivo +
                ", negative=" + negativo +
                ", neutral=" + neutral +
                ", mixed=" + mixto +
                '}';
    }

    public Double getPositive() {
        return positivo;
    }

    public void setPositive(Double positive) {
        this.positivo = positive;
    }

    public Double getNegative() {
        return negativo;
    }

    public void setNegative(Double negativo) {
        this.negativo = negativo;
    }

    public Double getNeutral() {
        return neutral;
    }

    public void setNeutral(Double neutral) {
        this.neutral = neutral;
    }

    public Double getMixed() {
        return mixto;
    }

    public void setMixed(Double mixed) {
        this.mixto = mixed;
    }
}
