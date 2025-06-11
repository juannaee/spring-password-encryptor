package com.projetoSpringSecurity.projetoSpringSecurity.dto;

public class PasswordResponseDTO {

	private String encryptedPassword;

	public PasswordResponseDTO(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}

	public String getEncryptedPassword() {
		return encryptedPassword;
	}

}
