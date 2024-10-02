package com.rest_demo.model;

public class CloudVendor {

    private String id;
    private String vendorName;
    private String vendorPhoneNumber;

    public CloudVendor(String id, String vendorName, String vendorPhoneNumber) {
        this.id = id;
        this.vendorName = vendorName;
        this.vendorPhoneNumber = vendorPhoneNumber;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorPhoneNumber() {
        return vendorPhoneNumber;
    }

    public void setVendorPhoneNumber(String vendorPhoneNumber) {
        this.vendorPhoneNumber = vendorPhoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
