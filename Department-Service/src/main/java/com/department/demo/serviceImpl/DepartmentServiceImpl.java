package com.department.demo.serviceImpl;

import com.department.demo.model.Department;
import com.department.demo.repository.DepartmentRepository;
import com.department.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public List<Department> findAllDepartments() {
        return departmentRepository.findAll();
    }
}
