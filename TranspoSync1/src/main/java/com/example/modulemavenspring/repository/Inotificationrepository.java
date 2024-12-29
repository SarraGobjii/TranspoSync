package com.example.modulemavenspring.repository;

import com.example.modulemavenspring.entities.Notification;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Inotificationrepository extends CrudRepository<Notification, Long> {
}
