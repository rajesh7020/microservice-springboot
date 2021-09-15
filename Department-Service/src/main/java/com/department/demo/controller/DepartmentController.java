package com.department.demo.controller;

import com.department.demo.model.Department;
import com.department.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping(produces = "application/json")
    public List<Department> findAllDepartments() {
        return departmentService.findAllDepartments();
    }
}
