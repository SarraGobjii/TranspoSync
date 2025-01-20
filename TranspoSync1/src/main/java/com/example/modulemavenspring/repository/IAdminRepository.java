package com.example.modulemavenspring.repository;

import com.example.modulemavenspring.entities.Admin;
import org.springframework.data.repository.CrudRepository;

public interface IAdminRepository extends CrudRepository<Admin, Long> {
}
