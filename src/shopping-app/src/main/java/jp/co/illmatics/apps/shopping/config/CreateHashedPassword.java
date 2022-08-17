package jp.co.illmatics.apps.shopping.config;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class CreateHashedPassword {
	public static void main(String[] args) {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		String hashedPassword = bCryptPasswordEncoder.encode("pass"); //""の中に生のパスワードを入力
		
		System.out.println(hashedPassword);
	}
}
