package com.example.s5miniProjectBackend.repository;

import com.example.s5miniProjectBackend.entity.UserForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserFormRepository extends JpaRepository<UserForm, Integer> {
}
