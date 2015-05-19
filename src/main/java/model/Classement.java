package model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * Cette classe définit le classement globale
 * @author Jordan
 * 	
 */
@Entity
public class Classement {
	int id;
	private Collection<Joueur> joueurs = new ArrayList<Joueur>();

	@Id
	public int getId() {
		return id;
	}

	@ManyToMany(cascade=CascadeType.ALL, mappedBy="classements")
	public Collection<Joueur> getJoueurs(){	
		return joueurs;
	}

	public void setJoueurs(Collection<Joueur> joueurs){
		this.joueurs = joueurs;
	}
}
