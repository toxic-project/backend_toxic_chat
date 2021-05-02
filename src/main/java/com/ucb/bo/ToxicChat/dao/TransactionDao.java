package com.ucb.bo.ToxicChat.dao;

import com.ucb.bo.ToxicChat.model.Transaction;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TransactionDao {
    public Integer create(Transaction transaction);

    public Integer getLastInsertId();
}
