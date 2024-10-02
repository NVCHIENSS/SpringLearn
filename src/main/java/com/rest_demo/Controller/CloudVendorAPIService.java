package com.rest_demo.Controller;

import com.rest_demo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {

    @GetMapping("{vendorId}")
    public CloudVendor getCloudvendor(String vendorId) {
        return new CloudVendor("1", "chien", "0388894014");
    }

    @PostMapping
    public String createClouVendorDetail(@RequestBody CloudVendor cloudvendor) {
        System.out.println(cloudvendor.getVendorName());
        return "Post data successfully";
    }

    @PutMapping
    public String updateClouVendorDetail(@RequestBody CloudVendor cloudvendor) {
        System.out.println(cloudvendor.getVendorName());
        return "Update data successfully";
    }

    @DeleteMapping
    public String deleteClouVendorDetail(@RequestBody CloudVendor cloudvendor) {
        System.out.println(cloudvendor.getVendorName());
        return "Delete data successfully";
    }
}
