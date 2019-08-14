package com.example.demo.survey;

import java.util.Set;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


import lombok.Data;

@Data
@Entity
public class UserEntity {

	@Id
	@GeneratedValue
	int uid;
    String uname;
   @OneToMany(mappedBy="ue")
    Set<UserResponse> ur;
   
 
	
}
