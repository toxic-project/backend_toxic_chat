package com.ucb.bo.ToxicChat.util;

public class BodyAuth {
    private String client_id;
    private String client_secret;
    private String audience;
    private String grant_type;

    public BodyAuth() {
        client_id = "qCwtIvwHcCXOUUlj4aIZqnCpiJ6AR79H";
        client_secret = "dSzy-KLbtIQNppDPL9BcQB3jXDC9H9ersErwM6cGScEhw2EPSC2BY_xrk9RrgsPu";
        audience = "https://fulano-es.us.auth0.com/api/v2/";
        grant_type = "client_credentials";
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getClient_secret() {
        return client_secret;
    }

    public void setClient_secret(String client_secret) {
        this.client_secret = client_secret;
    }

    public String getAudience() {
        return audience;
    }

    public void setAudience(String audience) {
        this.audience = audience;
    }

    public String getGrant_type() {
        return grant_type;
    }

    public void setGrant_type(String grant_type) {
        this.grant_type = grant_type;
    }
}
