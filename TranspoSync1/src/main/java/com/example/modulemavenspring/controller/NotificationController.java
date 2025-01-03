package com.example.modulemavenspring.controller;

import com.example.modulemavenspring.entities.Notification;
import com.example.modulemavenspring.entities.Vehicule;
import com.example.modulemavenspring.service.InotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/NotificationController")
public class NotificationController {
    @Autowired
    private InotificationService notificationService;
    @PostMapping("/addNotification")
    public Notification addNotification(@RequestBody Notification notification){
        return notificationService.addNotification(notification);
    }
    @GetMapping("/getNotification/{idN}")
    public Notification retrieveNotification(@PathVariable Long idN) {
        return notificationService.retrieveNotification(idN);
    }
    @GetMapping("/getAllNotifications")
    public List<Notification> retrieveAllNotifications() {
        return notificationService.retrieveAllNotifications();
    }
    @DeleteMapping("/deleteNotification/{idN}")
    public void removeNotification(@PathVariable Long idN) {
        notificationService.removeNotification(idN);
    }

    @PutMapping("/modifyNotification/{idN}")
    public Notification modifyNotification(@PathVariable Long idN, @RequestBody Notification notification) {
        return notificationService.modifyNotification(notification);
    }

}
