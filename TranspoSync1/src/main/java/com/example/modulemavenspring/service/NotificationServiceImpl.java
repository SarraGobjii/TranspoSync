package com.example.modulemavenspring.service;

import com.example.modulemavenspring.entities.Notification;
import com.example.modulemavenspring.repository.Inotificationrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationServiceImpl implements InotificationService {
    @Autowired
    Inotificationrepository notificationrepository;
    @Override
    public Notification addNotification(Notification notification) {
        return notificationrepository.save(notification);
    }

    @Override
    public List<Notification> retrieveAllNotifications() {
        return notificationrepository.findAll(noti);
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
