package com.projetoSpringSecurity.projetoSpringSecurity.controllers;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoSpringSecurity.projetoSpringSecurity.dto.PasswordRequestDTO;
import com.projetoSpringSecurity.projetoSpringSecurity.dto.PasswordResponseDTO;

@RestController
@RequestMapping("/api")
public class EncryptController {

	private final PasswordEncoder passwordEncoder;

	public EncryptController(PasswordEncoder passwordEncoder) {
		this.passwordEncoder = passwordEncoder;
	}

	@PostMapping("/encrypt")
	public PasswordResponseDTO encryptPassword(@RequestBody PasswordRequestDTO passwordRequestDTO) {
		String encrypted = passwordEncoder.encode(passwordRequestDTO.getPassword());
		return new PasswordResponseDTO(encrypted);

	}

}
