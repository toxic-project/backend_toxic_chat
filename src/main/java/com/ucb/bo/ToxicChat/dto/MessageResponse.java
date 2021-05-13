package com.ucb.bo.ToxicChat.dto;

public class MessageResponse {
    private String date;
    private String from;
    private String messages;
    private String emoticon;
    private String coloremoticon;
    private String colorUser;

    public MessageResponse() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }

    public String getEmoticon() {
        return emoticon;
    }

    public void setEmoticon(String emoticon) {
        this.emoticon = emoticon;
    }

    public String getColoremoticon() {
        return coloremoticon;
    }

    public void setColoremoticon(String coloremoticon) {
        this.coloremoticon = coloremoticon;
    }

    public String getColorUser() {
        return colorUser;
    }

    public void setColorUser(String colorUser) {
        this.colorUser = colorUser;
    }
}
