package com.ucb.bo.ToxicChat.model;

public class ResultHasEntities {
    private Integer idResultEntities;
    private Integer idResults;
    private Integer idEntities;

    public ResultHasEntities() {
    }

    public ResultHasEntities(Integer idResultEntities, Integer idResults, Integer idEntities) {
        this.idResultEntities = idResultEntities;
        this.idResults = idResults;
        this.idEntities = idEntities;
    }

    @Override
    public String toString() {
        return "ResultHasEntities{" +
                "idResultEntities=" + idResultEntities +
                ", idResults=" + idResults +
                ", idEntities=" + idEntities +
                '}';
    }

    public Integer getIdResultEntities() {
        return idResultEntities;
    }

    public void setIdResultEntities(Integer idResultEntities) {
        this.idResultEntities = idResultEntities;
    }

    public Integer getIdResults() {
        return idResults;
    }

    public void setIdResults(Integer idResults) {
        this.idResults = idResults;
    }

    public Integer getIdEntities() {
        return idEntities;
    }

    public void setIdEntities(Integer idEntities) {
        this.idEntities = idEntities;
    }
}
