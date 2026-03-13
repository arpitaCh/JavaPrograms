package com.thinkconstructive.restdemo.repository;

import com.thinkconstructive.restdemo.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface cloudvendorRepository extends JpaRepository<CloudVendor, String> {
}
