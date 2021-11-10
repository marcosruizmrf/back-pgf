package com.marcos.todo.domain;

import javax.persistence.Entity;

@Entity
public class Did extends Todo {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String did;
	
	public Did() {
		super();
	}

	public Did(String did) {
		super();
		this.did = did;
	}

	public String getDid() {
		return did;
	}

	public void setDid(String did) {
		this.did = did;
	}

	
 }
