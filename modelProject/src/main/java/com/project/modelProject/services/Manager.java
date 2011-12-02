package com.project.modelProject.services;

import com.project.modelProject.beans.Equipier;

public class Manager {

	private Equipier perso;
	

	public Manager(){
		
	}
	
	public Manager(String lastName, String firstName, String uids){
		
		perso= new Equipier();
	}
	
	public Equipier getPerso() {
		return perso;
	}

	public void setPerso(Equipier perso) {
		this.perso = perso;
	}

	
}
