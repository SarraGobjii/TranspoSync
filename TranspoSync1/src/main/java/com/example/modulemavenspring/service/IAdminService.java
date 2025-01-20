package com.example.modulemavenspring.service;

import com.example.modulemavenspring.entities.Admin;
import com.example.modulemavenspring.entities.Itineraire;
import com.example.modulemavenspring.entities.Reservation;

import java.util.List;

public interface IAdminService {
    List<Admin> getAllAdmin();
    Admin getAdminById(Long id);
    Admin createAdmin(Admin admin);
    Admin updateAdmin(Admin admin);
    void deleteAdmin(Long id);


}

