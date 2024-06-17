package com.example.notificationssoftwarearchitecture.repository;

import com.example.notificationssoftwarearchitecture.entity.UserSettingsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSettingsRepository extends JpaRepository<UserSettingsEntity, Integer> {
}
