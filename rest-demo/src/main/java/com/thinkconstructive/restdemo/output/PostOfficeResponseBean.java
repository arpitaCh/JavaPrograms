package com.thinkconstructive.restdemo.output;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PostOfficeResponseBean {


    @JsonProperty("Message")
    private String Message;

    @JsonProperty("Status")
    private String  Status;

    @JsonProperty("PostOffice")
    private List<PostOfficeDetailsBean> PostOffice;

}
