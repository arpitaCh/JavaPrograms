package com.thinkconstructive.restdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface passengerRepo extends JpaRepository<paymentRepo, String> {
}
