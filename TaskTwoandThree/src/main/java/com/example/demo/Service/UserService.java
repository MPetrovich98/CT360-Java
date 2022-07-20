package com.example.demo.Service;

import com.example.demo.Model.Department;
import com.example.demo.Model.Role;
import com.example.demo.Model.User;
import com.example.demo.Repository.DepartmentRepository;
import com.example.demo.Repository.RoleRepository;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    DepartmentRepository departmentRepository;

    public void saveUserWithDefaultRole(User user){
        user.setPassword(user.getPassword());

        Role roleUser = roleRepository.findByName("User");
        user.addRole(roleUser);

        userRepository.save(user);
    }

    public List<User> listAll(){
        return userRepository.findAll();
    }
    public User get(Integer id){
        return userRepository.findById(id).get();
    }
    public List<Role> getRoles(){
        return roleRepository.findAll();
    }
    public List<Department> getDep(){
        return departmentRepository.findAll();
    }
    public void edit(User user){
        user.setPassword(user.getPassword());
        userRepository.save(user);
    }
    public void delete(User user){
        userRepository.delete(user);
    }

}