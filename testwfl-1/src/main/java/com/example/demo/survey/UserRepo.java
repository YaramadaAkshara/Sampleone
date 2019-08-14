package com.example.demo.survey;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserResponse, Long> {

}
