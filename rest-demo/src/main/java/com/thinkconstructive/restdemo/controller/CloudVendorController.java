package com.thinkconstructive.restdemo.controller;


import com.thinkconstructive.restdemo.model.CloudVendor;
import com.thinkconstructive.restdemo.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")

public class CloudVendorController {

    CloudVendorService cloudvendorservice;

    public CloudVendorController(CloudVendorService cloudvendorservice) {
        this.cloudvendorservice = cloudvendorservice;
    }

    CloudVendor cloudVendor;

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId){

        return  cloudvendorservice.getCloudVendor(vendorId);


    }

    @GetMapping()
    public List<CloudVendor> getAllCloudVendorDetails(){

        return  cloudvendorservice.getAllCloudVendorDetails();


    }


    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
cloudvendorservice.createCloudVendor(cloudVendor);
//        this.cloudVendor=cloudVendor;
        return "cloud vendor created successfully";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        cloudvendorservice.updateCloudVendor(cloudVendor);
//        this.cloudVendor=cloudVendor;
        return "cloud vendor updated successfully";
    }

    @DeleteMapping
    public String deleteCloudVendorDetails(String vendorId){
cloudvendorservice.deleteCloudVendor(vendorId);
//        this.cloudVendor=null;
        return "cloud vendor deleted successfully";
    }


}
