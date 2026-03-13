package com.thinkconstructive.restdemo.service.impl;

import com.thinkconstructive.restdemo.model.Course;
import com.thinkconstructive.restdemo.repository.courseRepository;
import com.thinkconstructive.restdemo.service.courseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CourseImpl implements courseService
{

    @Autowired
    private courseRepository courseRepo;

    @Override
    public String upsert(Course course) {

        courseRepo.save(course);

        return "succcess";
    }

    @Override
    public List<Course> getAllCourses() {


        return courseRepo.findAll();
    }

    @Override
    public Course getById(Integer cid) {

        Optional<Course> findById= courseRepo.findById(cid);
        if(findById.isPresent()){
            return findById.get();
        }
        return null;
    }

    @Override
    public String deleteById(Integer cid) {

        if(courseRepo.existsById(cid)){
            courseRepo.deleteById(cid);
            return "delete success";
        }
        else{
            return "no record found";
        }
    }
}
