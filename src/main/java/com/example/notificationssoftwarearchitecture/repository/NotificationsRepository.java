package com.example.notificationssoftwarearchitecture.repository;

import com.example.notificationssoftwarearchitecture.entity.NotificationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationsRepository extends JpaRepository<NotificationEntity, Integer> {
}
