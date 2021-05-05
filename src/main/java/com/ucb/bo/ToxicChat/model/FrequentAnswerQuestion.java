package com.ucb.bo.ToxicChat.model;

import java.util.Date;

public class FrequentAnswerQuestion extends Transactions{
    private Integer idFaq;
    private String question;
    private String answer;

    public FrequentAnswerQuestion() {
    }

    public FrequentAnswerQuestion(Integer txId, String txHost, Integer txUserId, Date txDate) {
        super(txId, txHost, txUserId, txDate);
    }

    public FrequentAnswerQuestion(Integer idFaq, String question, String answer) {
        this.idFaq = idFaq;
        this.question = question;
        this.answer = answer;
    }

    public FrequentAnswerQuestion(Integer txId, String txHost, Integer txUserId, Date txDate, Integer idFaq, String question, String answer) {
        super(txId, txHost, txUserId, txDate);
        this.idFaq = idFaq;
        this.question = question;
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "FrequentAnswerQuestion{" +
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

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
