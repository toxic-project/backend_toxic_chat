package com.ucb.bo.ToxicChat.model;

import java.util.Date;

public class FrequentAskedQuestion extends Transactions {
    private Integer idFaq;
    private String question;

    public FrequentAskedQuestion() {
    }

    public FrequentAskedQuestion(Integer txId, String txHost, Integer txUserId, Date txDate) {
        super(txId, txHost, txUserId, txDate);
    }

    public FrequentAskedQuestion(Integer idFaq, String question) {
        this.idFaq = idFaq;
        this.question = question;
    }

    public FrequentAskedQuestion(Integer txId, String txHost, Integer txUserId, Date txDate, Integer idFaq, String question, String answer) {
        super(txId, txHost, txUserId, txDate);
        this.idFaq = idFaq;
        this.question = question;
    }

    @Override
    public String toString() {
        return "FrequentAskedQuestion{" +
                "idFaq=" + idFaq +
                ", question='" + question + '\'' +
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
}
