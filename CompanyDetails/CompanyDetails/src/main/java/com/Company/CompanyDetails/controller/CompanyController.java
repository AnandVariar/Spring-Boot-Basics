package com.Company.CompanyDetails.controller;


import com.Company.CompanyDetails.Com;
import com.Company.CompanyDetails.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class CompanyController {

    @Autowired
    CompanyService service;

    @GetMapping("empDetails")
    public List<Com> getDetails() {
        return service.getDetails();
    }
}
