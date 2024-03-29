package com.emanuelhonorio.resources;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emanuelhonorio.domain.Usuario;

@RestController
@RequestMapping("/account")
public class AccountResource {

	@PostMapping
	public ResponseEntity<?> register(@RequestBody @Valid Usuario usuario) {
		return ResponseEntity.ok(usuario);
	}
}
