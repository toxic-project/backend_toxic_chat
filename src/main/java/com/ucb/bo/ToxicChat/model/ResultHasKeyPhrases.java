package com.ucb.bo.ToxicChat.model;

public class ResultHasKeyPhrases {
    private Integer idResultPhrases;
    private Integer idResults;
    private Integer idKeyPhrases;

    public ResultHasKeyPhrases() {
    }

    public ResultHasKeyPhrases(Integer idResultPhrases, Integer idResults, Integer idKeyPhrases) {
        this.idResultPhrases = idResultPhrases;
        this.idResults = idResults;
        this.idKeyPhrases = idKeyPhrases;
    }

    @Override
    public String toString() {
        return "ResultHasKeyPhrases{" +
                "idResultPhrases=" + idResultPhrases +
                ", idResults=" + idResults +
                ", idKeyPhrases=" + idKeyPhrases +
                '}';
    }

    public Integer getIdResultPhrases() {
        return idResultPhrases;
    }

    public void setIdResultPhrases(Integer idResultPhrases) {
        this.idResultPhrases = idResultPhrases;
    }

    public Integer getIdResults() {
        return idResults;
    }

    public void setIdResults(Integer idResults) {
        this.idResults = idResults;
    }

    public Integer getIdKeyPhrases() {
        return idKeyPhrases;
    }

    public void setIdKeyPhrases(Integer idKeyPhrases) {
        this.idKeyPhrases = idKeyPhrases;
    }
}
