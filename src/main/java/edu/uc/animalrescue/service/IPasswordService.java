package edu.uc.animalrescue.service;

public interface IPasswordService {

	/**
	 * Hashes the password using the password and salt passed.
	 * @param password
	 * @param salt
	 * @return
	 */
	public byte[] hashPassword(String password, String salt);
	
	/**
	 * Generates a salt for use in hashing a password.
	 * @return
	 */
	public byte[] generateSalt();
	
	
}
