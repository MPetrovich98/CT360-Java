package com.example.demo.Repository;


import com.example.demo.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    @Query("SELECT r from Role r WHERE r.name = ?1")
    public Role findByName(String name);
}
