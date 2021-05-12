package com.ucb.bo.ToxicChat.api;

import org.apache.http.HttpResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeApi {
    private static final Logger log = LoggerFactory.getLogger(HomeApi.class);

    @GetMapping("/")
    public HttpResponse home(Model model, @AuthenticationPrincipal OidcUser principal) {
        log.info(model.toString());
        log.info(principal.toString());
//        return Unicode.;
        return null;
    }
}