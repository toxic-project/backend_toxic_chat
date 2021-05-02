package com.ucb.bo.ToxicChat.bl;


import com.ucb.bo.ToxicChat.dao.TransactionDao;
import com.ucb.bo.ToxicChat.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionBl {
    private final TransactionDao transactionDao;

    @Autowired
    public TransactionBl(TransactionDao transactionDao) {
        this.transactionDao = transactionDao;
    }

    public void createTransaction(Transaction transaction) {
        this.transactionDao.create(transaction);
        Integer lastPrimaryKey = this.transactionDao.getLastInsertId();
        transaction.setTxId(lastPrimaryKey);
    }
}
