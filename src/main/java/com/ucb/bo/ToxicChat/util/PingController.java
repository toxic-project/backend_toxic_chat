package com.ucb.bo.ToxicChat.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;


@Controller
@Component
public class PingController {

    private static final Logger log = LoggerFactory.getLogger(PingController.class);

    @RequestMapping(value = "/ping")
    @ResponseBody
    public String ping() {
        RestTemplate restTemplate = new RestTemplate();

        BodyAuth bodyAuth = new BodyAuth();
        Token response = restTemplate.postForObject("https://fulano-es.us.auth0.com/oauth/token", bodyAuth, Token.class);
//        RequestBodyEntity response = Unirest.post("https://fulano-es.us.auth0.com/oauth/token")
//                .header("content-type", "application/json")
//                .body("{\"client_id\":\"qCwtIvwHcCXOUUlj4aIZqnCpiJ6AR79H\",\"client_secret\":\"dSzy-KLbtIQNppDPL9BcQB3jXDC9H9ersErwM6cGScEhw2EPSC2BY_xrk9RrgsPu\",\"audience\":\"https://fulano-es.us.auth0.com/api/v2/\",\"grant_type\":\"client_credentials\"}");
        log.warn(response.toString());
        return "All good. You don't need to be authenticated to call this";
    }


}