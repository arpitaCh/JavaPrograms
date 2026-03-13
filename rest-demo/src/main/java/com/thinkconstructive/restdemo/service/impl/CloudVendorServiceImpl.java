package com.thinkconstructive.restdemo.service.impl;

import com.thinkconstructive.restdemo.exception.CloudVendorNotFoundException;
import com.thinkconstructive.restdemo.model.CloudVendor;
import com.thinkconstructive.restdemo.service.CloudVendorService;
import com.thinkconstructive.restdemo.repository.cloudvendorRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CloudVendorServiceImpl implements CloudVendorService {
    cloudvendorRepository cloudvendorRepository;
    public CloudVendorServiceImpl(cloudvendorRepository cloudvendorRepository) {
        this.cloudvendorRepository = cloudvendorRepository;
    }





    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudvendorRepository.save(cloudVendor);
        return "success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudvendorRepository.save(cloudVendor);
        return "success";
    }

    @Override
    public String deleteCloudVendor(String cloudvendorId) {
         cloudvendorRepository.deleteById(cloudvendorId);
        return "successfullly deleted";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {

        if(cloudvendorRepository.findById(cloudVendorId).isEmpty())
            throw new CloudVendorNotFoundException("requested npt found");
       return cloudvendorRepository.findById(cloudVendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendorDetails() {
       return  cloudvendorRepository.findAll();
    }
}
