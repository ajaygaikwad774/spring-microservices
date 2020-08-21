package com.demo;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class Practise {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		
		SecureRandom number = SecureRandom.getInstance("SHA1PRNG");
		
        System.out.println(number);
	}

}
