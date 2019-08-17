package com.example.demo.survey;




import java.util.Date;
import java.util.Map;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

import org.hibernate.annotations.Type;

import lombok.Data;

@Data
@Entity
public class UserResponse {

	
	@Id
	@GeneratedValue
	Long userresponseid;
	String urname;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="userid")
	 UserEntity ue;

	@Version
	@Type(type="dbtimestamp")
	private Date version;
	
	
	@ManyToMany(mappedBy="userResponsesSet")
	Set<QuestionEntity> questionEntitySet;
	
	
	@ElementCollection
	@Column(name="options")
	Map<QuestionEntity,String> selectedOptions;
}
