package com.project.modelProject.beans;

import java.io.Serializable;

public class Equipier implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private String uid;
	private String firstName;
	private String lastName;
	
	public Equipier(){
		
		
		
	}

	
	public Equipier(String uid, String firstName, String lastName){
		
		
		
	}
	
	public String getFirstName() {
		return firstName;
	}

	
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}
	
	public static void main(){
		
		System.out.println("test mail ismail");
	}
	
	
}
