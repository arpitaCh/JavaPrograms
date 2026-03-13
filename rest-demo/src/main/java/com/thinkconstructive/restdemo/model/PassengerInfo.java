package com.thinkconstructive.restdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table( name ="passenger_info")
public class PassengerInfo {


    @Id
    private Long Pid;
    private Date date;
            private String source;

            private String destination;

            private String email;

}
