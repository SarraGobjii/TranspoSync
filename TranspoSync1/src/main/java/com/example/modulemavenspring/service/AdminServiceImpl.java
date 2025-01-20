package com.example.modulemavenspring.service;

import com.example.modulemavenspring.entities.Admin;
import com.example.modulemavenspring.entities.Itineraire;
import com.example.modulemavenspring.repository.IAdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements IAdminService {
    @Autowired
    private IAdminRepository adminRepository;
    @Override
    public List<Admin> getAllAdmin() {
        return (List<Admin>) adminRepository.findAll();
    }

    @Override
    public Admin getAdminById(Long idAdmin) {
        return adminRepository.findById(idAdmin).orElse(null);
    }

    @Override
    public Admin createAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public Admin updateAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public void deleteAdmin(Long idAdmin) {
        adminRepository.deleteById(idAdmin);

    }
}
