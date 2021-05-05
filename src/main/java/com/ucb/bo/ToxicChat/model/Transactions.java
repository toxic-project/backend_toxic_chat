package com.ucb.bo.ToxicChat.model;

import java.util.Date;

public class Transactions {
    private Integer txId;
    private String txHost;
    private Integer txUserId;
    private Date txDate;

    public Transactions() {
    }

    public Transactions(Integer txId, String txHost, Integer txUserId, Date txDate) {
        this.txId = txId;
        this.txHost = txHost;
        this.txUserId = txUserId;
        this.txDate = txDate;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "txId=" + txId +
                ", txHost='" + txHost + '\'' +
                ", txUserId=" + txUserId +
                ", txDate=" + txDate +
                '}';
    }

    public void setTransaction(Transactions transactions){
        setTxId(transactions.getTxId());
        setTxHost(transactions.getTxHost());
        setTxUserId(transactions.getTxUserId() != null? transactions.getTxUserId(): 0);
        setTxDate(transactions.getTxDate());
    }


    public Integer getTxId() {
        return txId;
    }

    public void setTxId(Integer txId) {
        this.txId = txId;
    }

    public String getTxHost() {
        return txHost;
    }

    public void setTxHost(String txHost) {
        this.txHost = txHost;
    }

    public Integer getTxUserId() {
        return txUserId;
    }

    public void setTxUserId(Integer txUserId) {
        this.txUserId = txUserId;
    }

    public Date getTxDate() {
        return txDate;
    }

    public void setTxDate(Date txDate) {
        this.txDate = txDate;
    }
}
