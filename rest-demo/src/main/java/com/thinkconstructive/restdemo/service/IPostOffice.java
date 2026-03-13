package com.thinkconstructive.restdemo.service;

import com.thinkconstructive.restdemo.output.PostOfficeResponseBean;

public interface IPostOffice {

    public PostOfficeResponseBean fetchPostalCodeByCity(String city);
}
