package com.ucb.bo.ToxicChat.dao;

import com.ucb.bo.ToxicChat.dto.UserResponse;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    //Get user details
    UserResponse getUser(Integer userid);
}
