package model;
/**
 * Interface d'�change si l'on souhaite modifier le Hash.
 * @author Matthieu
 * @author Jordan
 *
 */
public interface IHashPolicy {
	public String hashString(String s)throws Exception;
}
