package model;

import java.security.MessageDigest;
/**
 * Cette classe d�finit la m�thode utilis�e pour hasher le mot de passe.
 * @author Matthieu
 * @author Jordan
 */
public class HashSHA256 implements IHashPolicy {

	@Override 
	public String hashString(String s) throws Exception {
		MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
		messageDigest.update(s.getBytes());
		return new String(messageDigest.digest());
	}

}
