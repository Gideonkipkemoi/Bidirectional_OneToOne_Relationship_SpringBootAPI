package com.telusko.webtest.mypkg;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


import lombok.*;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name = "items")
public class Items {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int id;
	private String name;
	@JsonIgnore
	@OneToOne
	@MapsId
	@JoinColumn(name = "user_id")
	private User user;
}
