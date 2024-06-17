package com.example.notificationssoftwarearchitecture.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "notifications")
public class NotificationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 255, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String message;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date messageDate;

    @Column(length = 255, nullable = false)
    private String messageType;

    @Column(nullable = false)
    private int userId;

    public NotificationEntity() {
    }

    public NotificationEntity(int id, String title, String message, Date messageDate, String messageType, int userId) {
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
