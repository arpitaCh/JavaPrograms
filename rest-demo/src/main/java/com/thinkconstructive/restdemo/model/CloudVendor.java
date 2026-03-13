package com.thinkconstructive.restdemo.model;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cloud_vendor_info")
public class CloudVendor {


    @Id
    public String vendorId;
    public String  vendorName;
    public String vendorAddress;
    public String vendorPhoneNum;
    public  CloudVendor(){

    }

    public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorPhoneNum) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendorPhoneNum = vendorPhoneNum;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public String getVendorPhoneNum() {
        return vendorPhoneNum;
    }

    public void setVendorPhoneNum(String vendorPhoneNum) {
        this.vendorPhoneNum = vendorPhoneNum;
    }
}
