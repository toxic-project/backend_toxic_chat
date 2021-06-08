package com.ucb.bo.ToxicChat.dto;

public class Entities {
    private Float score;
    private String type;
    private String text;

    public Entities(Float score, String type, String text) {
        this.score = score;
        this.type = type;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Entities{" +
                "score=" + score +
                ", type='" + type + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
