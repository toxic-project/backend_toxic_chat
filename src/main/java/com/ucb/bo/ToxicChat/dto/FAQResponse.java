package com.ucb.bo.ToxicChat.dto;

import java.util.List;

public class FAQResponse {
    private Integer idFaq;
    private String question;
    private List<String> answer;

    public FAQResponse(Integer idFaq, String question, List<String> answer) {
        this.idFaq = idFaq;
        this.question = question;
        this.answer = answer;
    }

    public FAQResponse() {
    }

    @Override
    public String toString() {
        return "FAQResponse{" +
                "idFaq=" + idFaq +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }

    public Integer getIdFaq() {
        return idFaq;
    }

    public void setIdFaq(Integer idFaq) {
        this.idFaq = idFaq;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<String> getAnswer() {
        return answer;
    }

    public void setAnswer(List<String> answer) {
        this.answer = answer;
    }
}
