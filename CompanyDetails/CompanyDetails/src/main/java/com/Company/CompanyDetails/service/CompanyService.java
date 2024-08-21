package com.Company.CompanyDetails.service;


import com.Company.CompanyDetails.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    @Autowired
    Dao dao;

    public List<Emp> getDetails() {
        return dao.findAll();
    }
}
