package com.thinkconstructive.restdemo.output;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Data
public class PostOfficeDetailsBean {

    @JsonProperty("Name")
    private String name;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("BranchType")
    private String branchType;
    @JsonProperty("DeliveryStatus")
    private String DeliveryStatus;
    @JsonProperty("Circle")
    private String Circle;
    @JsonProperty("District")
    private String District;
    @JsonProperty("Division")
    private String Division;
    @JsonProperty("Region")
    private String Region;
    @JsonProperty("State")
    private String State;
    @JsonProperty("Country")
    private String country;
    @JsonProperty("Pincode")
    private  String pincode;

}
