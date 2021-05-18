package com.ucb.bo.ToxicChat.api;

import com.amazonaws.services.comprehend.model.Entity;
import com.ucb.bo.ToxicChat.bl.ComprenhendBl;
import com.ucb.bo.ToxicChat.bl.UserBl;
import com.ucb.bo.ToxicChat.dto.TextRequest;
import com.ucb.bo.ToxicChat.dto.UserResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserApi {
    private UserBl userBl;
    private static final Logger log = LoggerFactory.getLogger(UserApi.class);

    @Autowired
    public UserApi(UserBl userBl) {
        this.userBl = userBl;
    }

    @RequestMapping(value = "/{userId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public UserResponse getuser(@PathVariable("userId") Integer userid) {
        return userBl.userDetails(userid);

    }

}
