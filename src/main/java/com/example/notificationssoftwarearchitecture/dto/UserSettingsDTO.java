package com.example.notificationssoftwarearchitecture.dto;

public class UserSettingsDTO {

    private int id;
    private boolean notificationTurnedOn;

    public UserSettingsDTO() {
    }

    public UserSettingsDTO(int id, boolean notificationTurnedOn) {
        this.id = id;
        this.notificationTurnedOn = notificationTurnedOn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isNotificationTurnedOn() {
        return notificationTurnedOn;
    }

    public void setNotificationTurnedOn(boolean notificationTurnedOn) {
        this.notificationTurnedOn = notificationTurnedOn;
    }
}
