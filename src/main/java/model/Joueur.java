package model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * Cette classe définit le joueur pour les statistiques des parties.
 * @author Jordan
 * @author Matthieu
 */
@Entity
public class Joueur {
	int id;
	String name;
	String hashPass;
	IHashPolicy hashPolicy;
	int numberVictory;
	int numnerDefeat;
	int ratioVicDef;
	private Collection<Classement> classements = new ArrayList<Classement>();
	
	
	public Joueur(){
		hashPolicy = new HashSHA256();
	}
	
	@Id
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String s) throws Exception {
		hashPass = hashPolicy.hashString(s);
	}
	public int getNumberVictory() {
		return numberVictory;
	}

	public void setNumberVictory(int numberVictory) {
		this.numberVictory = numberVictory;
	}

	public int getNumnerDefeat() {
		return numnerDefeat;
	}

	public void setNumnerDefeat(int numnerDefeat) {
		this.numnerDefeat = numnerDefeat;
	}

	public int getRatioVicDef() {
		return ratioVicDef;
	}

	public void setRatioVicDef(int ratioVicDef) {
		this.ratioVicDef = ratioVicDef;
	}
	
	@ManyToMany(cascade=CascadeType.ALL, mappedBy="joueurs")
	public Collection<Classement> getClassements(){	
		return classements;
	}

	public void setClassements(Collection<Classement> classements){
		this.classements = classements;
	}
	
}