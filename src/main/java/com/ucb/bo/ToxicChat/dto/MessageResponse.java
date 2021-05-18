package com.ucb.bo.ToxicChat.dto;

public class MessageResponse {
    private String date;
    private String from;
    private String message;
    private String emoticon;
    private String coloremoticon;

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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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

}
