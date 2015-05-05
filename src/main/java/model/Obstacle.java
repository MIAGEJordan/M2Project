package model;

import javax.persistence.Entity;

@Entity
public class Obstacle extends Carre {
	boolean block;

	public boolean isBlock() {
		return block;
	}

	public void setBlock(boolean block) {
		this.block = block;
	}
}
