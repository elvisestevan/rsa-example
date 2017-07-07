package org.rsa_example;

public class Main {
	
	public static void main(String[] args) {
		int p = 17;
		int q = 11;
		
		int n = p * q;
		int z = (p - 1) * (q - 1);
		
		Integer d  = 7;
		Integer e;
		int resto = 0;
		
		Long numberToEncrypt = 4L;
		
		for (e = 0; resto != 1; e++) {
			resto = ((e + 1) * d) % z;
		}
		
		Double encrypted = Math.pow(Double.parseDouble(numberToEncrypt.toString()), Double.parseDouble(e.toString())) % n;
		Double decrypted = Math.pow(encrypted, Double.parseDouble(d.toString())) % n;
		
		System.out.println("P: " + p);
		System.out.println("Q: " + q);
		System.out.println("N: " + n);
		System.out.println("Z: " + z);
		System.out.println("E: " + e);
		System.out.println("Message to encrypt: " + numberToEncrypt);
		System.out.println("Encrypted: " + encrypted);
		System.out.println("Decrypted: " + decrypted);
	}

}
