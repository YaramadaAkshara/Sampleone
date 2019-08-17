package com.example.demo.survey;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserEntityRepo extends JpaRepository<UserEntity, Integer> {

	
	@Query(value="select * from User_Entity u where u.google_id=:check ", nativeQuery = true)
	UserEntity checkuserbygoogleid(@Param("check") String check);
}
