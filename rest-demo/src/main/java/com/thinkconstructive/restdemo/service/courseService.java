package com.thinkconstructive.restdemo.service;

import com.thinkconstructive.restdemo.model.Course;

import java.util.List;

public interface courseService {

    public String upsert(Course course);

    public List<Course> getAllCourses();

    public Course getById(Integer cid);

    public String deleteById(Integer cid);



}
