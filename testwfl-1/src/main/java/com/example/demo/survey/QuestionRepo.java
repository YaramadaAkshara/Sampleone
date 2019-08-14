package com.example.demo.survey;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepo extends JpaRepository<QuestionEntity, Integer> {

}
