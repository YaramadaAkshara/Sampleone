package com.example.demo.survey;

import org.springframework.stereotype.Service;

@Service
public class UserEntityServiceImpl implements UserEntityService{
	
	private final UserEntityRepo repo;
	
	public UserEntityServiceImpl(UserEntityRepo repo)
	{
		this.repo=repo;
	}
	
	
	public UserEntity getUserDetails(String check) throws Exception {
		
		
	UserEntity xe =repo.checkuserbygoogleid(check);
		return xe;
	}

}