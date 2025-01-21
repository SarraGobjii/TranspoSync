package com.example.modulemavenspring.controller;

import com.example.modulemavenspring.entities.Admin;
import com.example.modulemavenspring.repository.IAdminRepository;
import com.example.modulemavenspring.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/AdminController")
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class AdminController {
    @Autowired
    private IAdminService adminService;
    @GetMapping("/getAllAdmin")
    public List<Admin> getAllAdmin() {
        return adminService.getAllAdmin();
    }
    @GetMapping("GetAdmin/{idAdmin}")
    public Admin getAdminById(@PathVariable Long idAdmin) {
        return adminService.getAdminById(idAdmin);
    }
    @PostMapping("/addAdmin")
    public Admin createAdmin(@RequestBody Admin admin) {
        return adminService.createAdmin(admin);
    }
    @PutMapping("/updateAdmin/{idAdmin}")
    public Admin updateAdmin(@PathVariable Long idAdmin, Admin admin) {
        return adminService.updateAdmin(admin);
    }
    @DeleteMapping("/deleteAdmin{idAdmin}")
    public void deleteAdmin(@PathVariable Long idAdmin) {
        adminService.deleteAdmin(idAdmin);

    }
}
