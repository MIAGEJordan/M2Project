package model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Joueur {
	int id;
	String name;
	String hashPass;
	IHashPolicy hashPolicy;

	public Joueur(){
		hashPolicy = new HashSHA256();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Id
	public int getId() {
		return id;
	}
	
	public void setPassword(String s) throws Exception {
		hashPass = hashPolicy.hashString(s);
	}
}