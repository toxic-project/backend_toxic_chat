package com.ucb.bo.ToxicChat.dto;

public class ResultsResponse {
    private Entities entities;
    private Comprehend comprehend;

    public ResultsResponse(Entities entities, Comprehend comprehend) {
        this.entities = entities;
        this.comprehend = comprehend;
    }

    public ResultsResponse() {
    }

    @Override
    public String toString() {
        return "ResultsResponse{" +
                "entities=" + entities.toString() +
                ", comprehend=" + comprehend.toString() +
                '}';
    }

    public Entities getEntities() {
        return entities;
    }

    public void setEntities(Entities entities) {
        this.entities = entities;
    }

    public Comprehend getComprehend() {
        return comprehend;
    }

    public void setComprehend(Comprehend comprehend) {
        this.comprehend = comprehend;
    }
}

