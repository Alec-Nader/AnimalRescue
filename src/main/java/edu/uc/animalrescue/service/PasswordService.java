package edu.uc.animalrescue.service;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;

import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

import org.springframework.stereotype.Component;

@Component
public class PasswordService implements IPasswordService {

	final int iterations = 10000;
	final int keyLength = 512;
	
	@Override
	public byte[] hashPassword(String password, String salt) {
		char[] charPassword = password.toCharArray();
		byte[] byteSalt = salt.getBytes();
		try {
            SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA512");
            PBEKeySpec spec = new PBEKeySpec(charPassword, byteSalt, iterations, keyLength);
            SecretKey key = skf.generateSecret(spec);
            return key.getEncoded();            
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            throw new RuntimeException(e);
        }
	}

	@Override
	public byte[] generateSalt() {
		SecureRandom random = new SecureRandom();
        byte bytes[] = new byte[20];
        random.nextBytes(bytes);
        return bytes;
	}

}
