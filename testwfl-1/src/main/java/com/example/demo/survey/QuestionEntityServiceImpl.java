package com.example.demo.survey;

import org.springframework.stereotype.Service;

@Service
public class QuestionEntityServiceImpl implements QuestionEntityService {
	
private final QuestionRepo repo;
	
	public QuestionEntityServiceImpl(QuestionRepo repo)
	{
		this.repo=repo;
	}
	
	
	public QuestionEntity getQuestionsfromTable() throws Exception {
		
		
	QuestionEntity qe =repo.getQuestionsrepo();
		return qe;
	}

}
