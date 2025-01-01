package com.example.modulemavenspring.service;

import com.example.modulemavenspring.entities.Notification;
import com.example.modulemavenspring.repository.Inotificationrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        return (List<Notification>) notificationrepository.findAll();
    }

    @Override
    public Notification retrieveNotification(Long idN) {
        return notificationrepository.findById(idN).orElse(null);
    }

    @Override
    public void removeNotification(Long idN) {
        notificationrepository.deleteById(idN);
    }
    @Override
    public Notification modifyNotification(Notification notification) {
        return notificationrepository.save(notification);
    }
}
