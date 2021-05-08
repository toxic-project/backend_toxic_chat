package com.ucb.bo.ToxicChat.model;

public class Entities {
    private Integer idEntities;
    private Float score;
    private String type;
    private String text;
    private Integer beginOffset;
    private Integer endOffset;

    public Entities() {
    }

    public Entities(Integer idEntities, Float score, String type, String text, Integer beginOffset, Integer endOffset) {
        this.idEntities = idEntities;
        this.score = score;
        this.type = type;
        this.text = text;
        this.beginOffset = beginOffset;
        this.endOffset = endOffset;
    }

    @Override
    public String toString() {
        return "Entities{" +
                "idEntities=" + idEntities +
                ", score=" + score +
                ", type='" + type + '\'' +
                ", text='" + text + '\'' +
                ", beginOffset=" + beginOffset +
                ", endOffset=" + endOffset +
                '}';
    }

    public Integer getIdEntities() {
        return idEntities;
    }

    public void setIdEntities(Integer idEntities) {
        this.idEntities = idEntities;
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
