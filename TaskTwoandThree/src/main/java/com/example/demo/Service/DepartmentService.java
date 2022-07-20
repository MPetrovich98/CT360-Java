package com.example.demo.Service;

import com.example.demo.Model.Department;
import com.example.demo.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    public List<Department> listAll(){
        return departmentRepository.findAll();
    }

    public void saveDepartment(Department department){
        departmentRepository.save(department);
    }
    public void deleteDepartment(Integer id){
        departmentRepository.deleteById(id);

    }
    public Department get(Integer id){
        return departmentRepository.getById(id);
    }
    public void edit(Department department){
        departmentRepository.save(department);
    }
}
