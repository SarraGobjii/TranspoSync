package com.example.modulemavenspring.repository;

import com.example.modulemavenspring.entities.Payment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ipaymentrepository extends CrudRepository<Payment, Long> {
}
