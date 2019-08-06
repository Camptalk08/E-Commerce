package com.ing.ecommerce.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ing.ecommerce.dto.UserDTO;
import com.ing.ecommerce.entity.User;
import com.ing.ecommerce.service.UserService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {
	@Autowired
	UserService userService;
	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

	@PostMapping(value = "/user")
	public ResponseEntity<UserDTO> saveUserDetails(@RequestBody UserDTO request) throws Exception {
		LOGGER.info("inside Controller userDetails");
		UserDTO userResponseDTO = userService.saveUserDetails(request);

		return new ResponseEntity<>(userResponseDTO, HttpStatus.CREATED);

	}
	
	@PostMapping("/login/{userId}/{password}")
	public ResponseEntity<String> login(@PathVariable Long userId, @PathVariable String password) throws Exception {
	
		 String response= userService.login(userId, password);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}
