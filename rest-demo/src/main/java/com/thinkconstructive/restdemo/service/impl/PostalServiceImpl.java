package com.thinkconstructive.restdemo.service.impl;

import com.thinkconstructive.restdemo.output.PostOfficeDetailsBean;
import com.thinkconstructive.restdemo.output.PostOfficeResponseBean;
import com.thinkconstructive.restdemo.service.IPostOffice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
@Service("postalServiceImpl")
public class PostalServiceImpl implements IPostOffice {

    @Autowired
    RestTemplate restTemplate;
    @Override
    public PostOfficeResponseBean fetchPostalCodeByCity(String city) {

        String url="https://api.postalpincode.in/postoffice/{city}";
        url= url.replace("{city}", city);
        System.out.println("url is "+ url);

        ResponseEntity<PostOfficeResponseBean[]> postalResponseEntity= restTemplate.getForEntity(url,PostOfficeResponseBean[].class);

        System.out.println(postalResponseEntity.getStatusCode());

        PostOfficeResponseBean[]  responseBeanArray = postalResponseEntity.getBody();

//        for(PostOfficeResponseBean responseBean : responseBeanArray) {
//            List<PostOfficeDetailsBean> postofficeDetailsBean =  responseBean.ge
//        }






        return null;
    }
}

