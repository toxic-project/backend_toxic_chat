package com.ucb.bo.ToxicChat.bl;

import com.ucb.bo.ToxicChat.dao.UserDao;
import com.ucb.bo.ToxicChat.dto.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserBl {

    private UserDao userDao;

    @Autowired
    public UserBl(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserResponse userDetails(Integer userid) {
        return userDao.getUser(userid);
    }
}
