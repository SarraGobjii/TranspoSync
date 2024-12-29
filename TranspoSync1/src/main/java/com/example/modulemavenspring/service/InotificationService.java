package com.example.modulemavenspring.service;


import com.example.modulemavenspring.entities.Itinerary;
import com.example.modulemavenspring.entities.Notification;

import java.util.List;

public interface InotificationService {
    public Notification addNotification (Notification notification);
    public List<Notification > retrieveAllNotifications();
    public  Notification retrieveNotification(Long  idN);
    public void removeNotification   (Long idN);
    public  Notification   modifyNotification    (Notification notification);
}
