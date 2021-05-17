package com.ucb.bo.ToxicChat.dto;

import java.util.List;
public class MessagesRequest {
    List<Messages> data;

    public MessagesRequest() {
    }

    public List<Messages> getData() {
        return data;
    }

    public void setData(List<Messages> data) {
        this.data = data;
    }
}
