package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pion {
	int id;

	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
