package com.ucb.bo.ToxicChat.model;

public class Results {
    private Integer idResults;
    private Integer idUser;
    private Integer idSentiment;

    public Results() {
    }

    public Results(Integer idResults, Integer idUser, Integer idSentiment) {
        this.idResults = idResults;
        this.idUser = idUser;
        this.idSentiment = idSentiment;
    }

    @Override
    public String toString() {
        return "Results{" +
                "idResults=" + idResults +
                ", idUser=" + idUser +
                ", idSentiment=" + idSentiment +
                '}';
    }

    public Integer getIdResults() {
        return idResults;
    }

    public void setIdResults(Integer idResults) {
        this.idResults = idResults;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public Integer getIdSentiment() {
        return idSentiment;
    }

    public void setIdSentiment(Integer idSentiment) {
        this.idSentiment = idSentiment;
    }
}
