package br.com.nex2you.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping
	public ResponseEntity<String> teste() {
		return ResponseEntity.ok("ok");
	}
	
	
}
