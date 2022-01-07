package com.springboot.tutorial.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.tutorial.entity.Employee;
import com.springboot.tutorial.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    @Override
    public List < Employee > listAll() {
        return repo.findAll();
    }

    @Override
    public void save(Employee emp) {
        repo.save(emp);
    }
}