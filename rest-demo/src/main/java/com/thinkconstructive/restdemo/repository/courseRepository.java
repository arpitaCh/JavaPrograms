package com.thinkconstructive.restdemo.repository;

import com.thinkconstructive.restdemo.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface courseRepository extends JpaRepository<Course, Serializable> {


}
