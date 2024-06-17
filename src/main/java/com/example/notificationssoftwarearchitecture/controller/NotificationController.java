package com.example.notificationssoftwarearchitecture.controller;

import com.example.notificationssoftwarearchitecture.dto.NotificationsDTO;
import com.example.notificationssoftwarearchitecture.entity.NotificationEntity;
import com.example.notificationssoftwarearchitecture.repository.NotificationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;
import java.util.List;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    @Autowired
    private NotificationsRepository notificationRepository;

    @GetMapping
    public List<NotificationsDTO> getAllNotifications() {
        return notificationRepository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public NotificationsDTO getNotificationById(@PathVariable int id) {
        return notificationRepository.findById(id).map(this::convertToDTO).orElse(null);
    }

    @PostMapping
    public NotificationsDTO createNotification(@RequestBody NotificationsDTO notificationDTO) {
        NotificationEntity notification = new NotificationEntity();
        notification.setTitle(notificationDTO.getTitle());
        notification.setMessage(notificationDTO.getMessage());
        notification.setMessageDate(notificationDTO.getMessageDate());
        notification.setMessageType(notificationDTO.getMessageType());
        notification.setUserId(notificationDTO.getUserId());
        NotificationEntity savedNotification = notificationRepository.save(notification);
        return convertToDTO(savedNotification);
    }

    @PutMapping("/{id}")
    public NotificationsDTO updateNotification(@PathVariable int id, @RequestBody NotificationsDTO notificationDTO) {
        return notificationRepository.findById(id).map(notification -> {
            notification.setTitle(notificationDTO.getTitle());
            notification.setMessage(notificationDTO.getMessage());
            notification.setMessageDate(notificationDTO.getMessageDate());
            notification.setMessageType(notificationDTO.getMessageType());
            notification.setUserId(notificationDTO.getUserId());
            NotificationEntity updatedNotification = notificationRepository.save(notification);
            return convertToDTO(updatedNotification);
        }).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteNotification(@PathVariable int id) {
        notificationRepository.deleteById(id);
    }

    private NotificationsDTO convertToDTO(NotificationEntity notification) {
        NotificationsDTO dto = new NotificationsDTO();
        dto.setId(notification.getId());
        dto.setTitle(notification.getTitle());
        dto.setMessage(notification.getMessage());
        dto.setMessageDate(notification.getMessageDate());
        dto.setMessageType(notification.getMessageType());
        dto.setUserId(notification.getUserId());
        return dto;
    }

}
