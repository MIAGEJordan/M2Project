package model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Joueur {
	int id;
	String name;

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

	public void setId(int id) {
		this.id = id;
	}
}