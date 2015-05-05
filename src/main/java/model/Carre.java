package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Carre {
	int id;
	int x;
	int y;
	
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}
