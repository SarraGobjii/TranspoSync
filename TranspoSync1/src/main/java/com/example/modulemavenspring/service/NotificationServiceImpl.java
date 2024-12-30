package com.example.modulemavenspring.service;

import com.example.modulemavenspring.entities.Notification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationServiceImpl implements InotificationService {
    @Override
    public Notification addNotification(Notification notification) {
        return null;
    }

    @Override
    public List<Notification> retrieveAllNotifications() {
        return null;
    }

    @Override
    public Notification retrieveNotification(Long idN) {
        return null;
    }

    @Override
    public void removeNotification(Long idN) {

    }

    @Override
    public Notification modifyNotification(Notification notification) {
        return null;
    }
}
