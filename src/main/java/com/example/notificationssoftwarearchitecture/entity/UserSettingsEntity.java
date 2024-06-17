package com.example.notificationssoftwarearchitecture.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user_settings")
public class UserSettingsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private boolean notificationTurnedOn;
}
