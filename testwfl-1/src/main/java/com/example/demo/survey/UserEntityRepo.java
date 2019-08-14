package com.example.demo.survey;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserEntityRepo extends JpaRepository<UserEntity, Integer> {

}
