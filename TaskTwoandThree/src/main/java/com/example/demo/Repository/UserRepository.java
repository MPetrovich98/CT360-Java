package com.example.demo.Repository;

import com.example.demo.Model.Department;
import com.example.demo.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findUserByEmail(String email);

    List<User> getUsersByDepartment(Department department);
}

