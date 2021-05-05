package com.ucb.bo.ToxicChat.dao;

import com.ucb.bo.ToxicChat.model.Transactions;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TransactionDao {
    public Integer create(Transactions transactions);

    public Integer getLastInsertId();
}
