package com.example.demo.survey;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface QuestionRepo extends JpaRepository<QuestionEntity, Integer> {

	
	@Query(value="select q.qid,q.question,t.options from Question_Entity q naturaljoin Question_Entity_options t  ", nativeQuery = true)
	QuestionEntity getQuestionsrepo();
}
