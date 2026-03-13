package com.thinkconstructive.restdemo.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="COURSE_DTLS")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cid;

    private String cname;

    private int cprice;

}
