package com.ucb.bo.ToxicChat.bl;


import com.ucb.bo.ToxicChat.dao.TransactionDao;
import com.ucb.bo.ToxicChat.model.Transactions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionBl {
    private final TransactionDao transactionDao;

    @Autowired
    public TransactionBl(TransactionDao transactionDao) {
        this.transactionDao = transactionDao;
    }

    public void createTransaction(Transactions transactions) {
        this.transactionDao.create(transactions);
        Integer lastPrimaryKey = this.transactionDao.getLastInsertId();
        transactions.setTxId(lastPrimaryKey);
    }
}
