package com.example.access;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="user")
public class Article {
	@Id
	private Integer id;
	@Field("username")
	private String username;
	@Field("password")
	private String password;
	
	@DBRef
	private User author;
	
	@DBRef
	private List<User> likeUsers;
}
