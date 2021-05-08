package com.ucb.bo.ToxicChat.model;

public class KeyPhrases {
    private Integer idKeyPhrases;
    private Float score;
    private String text;
    private Integer beginOffset;
    private Integer endOffset;

    public KeyPhrases() {
    }

    public KeyPhrases(Integer idKeyPhrases, Float score, String text, Integer beginOffset, Integer endOffset) {
        this.idKeyPhrases = idKeyPhrases;
        this.score = score;
        this.text = text;
        this.beginOffset = beginOffset;
        this.endOffset = endOffset;
    }

    @Override
    public String toString() {
        return "KeyPhrases{" +
                "idKeyPhrases=" + idKeyPhrases +
                ", score=" + score +
                ", text='" + text + '\'' +
                ", beginOffset=" + beginOffset +
                ", endOffset=" + endOffset +
                '}';
    }

    public Integer getIdKeyPhrases() {
        return idKeyPhrases;
    }

    public void setIdKeyPhrases(Integer idKeyPhrases) {
        this.idKeyPhrases = idKeyPhrases;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getBeginOffset() {
        return beginOffset;
    }

    public void setBeginOffset(Integer beginOffset) {
        this.beginOffset = beginOffset;
    }

    public Integer getEndOffset() {
        return endOffset;
    }

    public void setEndOffset(Integer endOffset) {
        this.endOffset = endOffset;
    }
}
