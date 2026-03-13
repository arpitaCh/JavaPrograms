package com.thinkconstructive.restdemo.controller;

import com.thinkconstructive.restdemo.model.Course;
import com.thinkconstructive.restdemo.service.impl.CourseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class courseController {

    @Autowired
    CourseImpl courseimpl;

    @PostMapping("/course")
    public ResponseEntity<String>  createCourse(@RequestBody Course course){

        String status= courseimpl.upsert(course);
        return new ResponseEntity<>(status, HttpStatus.CREATED);
    }

    @GetMapping("/course/{cid}")
    public ResponseEntity<Course> getCourse(@PathVariable Integer cid){
        Course course= courseimpl.getById(cid);
        return new ResponseEntity<>(course, HttpStatus.OK);
    }


    @GetMapping("/course")
    public ResponseEntity<List<Course>> getAllCourses(){
        List<Course> allcourses= courseimpl.getAllCourses();
        return new ResponseEntity<>(allcourses,HttpStatus.OK);

    }

}
