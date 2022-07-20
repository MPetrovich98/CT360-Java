package com.example.demo.Service;

import com.example.demo.Model.Department;
import com.example.demo.Model.Role;
import com.example.demo.Repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    RoleRepository roleRepository;

    public List<Role> listAll(){
        return roleRepository.findAll();
    }

    public void saveRole(Role role){
        roleRepository.save(role);
    }
    public void deleteRole(Integer id){
        roleRepository.deleteById(id);

    }
    public Role get(Integer id){
        return roleRepository.getById(id);
    }
    public void edit(Role role){
        roleRepository.save(role);
    }
}