package com.thinkconstructive.restdemo.controller;


import com.thinkconstructive.restdemo.output.PostOfficeResponseBean;
import com.thinkconstructive.restdemo.service.impl.PostalServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/postal")
public class PostDetailsController {

    @Autowired
    PostalServiceImpl postalServiceimpl;

    @RequestMapping(value="byCity", method= RequestMethod.GET, consumes = MediaType.ALL_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public PostOfficeResponseBean getPostalByCity(@RequestParam String cityName){

        PostOfficeResponseBean PostOfficeResponse;

        PostOfficeResponse= postalServiceimpl.fetchPostalCodeByCity(cityName);

        return PostOfficeResponse;

    }
}
