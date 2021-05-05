package com.ucb.bo.ToxicChat.util;

import com.ucb.bo.ToxicChat.model.Transactions;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

public class TransactionUtil {

    public static Transactions createTransaction(HttpServletRequest request) {
        Transactions transactions = new Transactions();
        transactions.setTxDate(new Date());
        transactions.setTxHost(request.getRemoteHost());
        //transaction.setTxUserId(request.getUserPrincipal().getName()); TODO fix username instead of userId
        transactions.setTxUserId(0);
        return transactions;
    }
}
