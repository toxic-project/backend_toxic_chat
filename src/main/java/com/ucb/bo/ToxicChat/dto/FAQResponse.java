package com.ucb.bo.ToxicChat.dto;

import com.ucb.bo.ToxicChat.model.Answers;

import java.util.List;

public class FAQResponse {
    private Integer idFaq;
    private String question;
    private List<Answers> answers;

    public FAQResponse(Integer idFaq, String question, List<Answers> answer) {
        this.idFaq = idFaq;
        this.question = question;
        this.answers = answer;
    }

    public FAQResponse() {
    }

    @Override
    public String toString() {
        return "FAQResponse{" +
                "idFaq=" + idFaq +
                ", question='" + question + '\'' +
                ", answer='" + answers + '\'' +
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

    public List<Answers> getAnswer() {
        return answers;
    }

    public void setAnswer(List<Answers> answer) {
        this.answers = answer;
    }
}