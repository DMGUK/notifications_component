package com.example.notificationssoftwarearchitecture.dto;

import java.util.Date;

public class NotificationsDTO {

    private int id;
    private String title;
    private String message;
    private Date messageDate;
    private String messageType;
    private int userId;

    public NotificationsDTO() {
    }

    public NotificationsDTO(int id, String title, String message, Date messageDate, String messageType, int userId) {
        this.id = id;
        this.title = title;
        this.message = message;
        this.messageDate = messageDate;
        this.messageType = messageType;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getMessageDate() {
        return messageDate;
    }

    public void setMessageDate(Date messageDate) {
        this.messageDate = messageDate;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
