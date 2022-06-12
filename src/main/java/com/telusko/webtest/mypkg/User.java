package com.telusko.webtest.mypkg;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import lombok.*;


@Data @AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	
	
	@OneToOne(mappedBy="user", cascade = CascadeType.ALL)
	@JoinColumn( name = "id")
	private Items item;
}
