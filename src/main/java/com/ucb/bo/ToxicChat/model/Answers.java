package com.ucb.bo.ToxicChat.model;

public class Answers {
    private Integer idAnswer;
    private Integer idFaq;
    private String answer;

    public Answers() {
    }

    public Answers(Integer idAnswer, Integer idFaq, String answer) {
        this.idAnswer = idAnswer;
        this.idFaq = idFaq;
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Answers{" +
                "idAnswer=" + idAnswer +
                ", idFaq=" + idFaq +
                ", answer='" + answer + '\'' +
                '}';
    }

    public Integer getIdAnswer() {
        return idAnswer;
    }

    public void setIdAnswer(Integer idAnswer) {
        this.idAnswer = idAnswer;
    }

    public Integer getIdFaq() {
        return idFaq;
    }

    public void setIdFaq(Integer idFaq) {
        this.idFaq = idFaq;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
