package com.ty;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Cab {
	
	@Id
	private int id;
	private String name;
	private String number;
	
	@ManyToMany
	@JoinTable(name="my_user_cab",joinColumns=@JoinColumn(name="my_cab_id"),inverseJoinColumns=@JoinColumn(name="my_user_id"))
	private List<User> user;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}


}
