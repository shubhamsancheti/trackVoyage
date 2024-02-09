package com.trackvoyage.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trackvoyage.common.User;

@RestController
@RequestMapping(value = "/v1/User")
public class UserRegistrationController {
	@GetMapping(value = "/getAllUsers")
	public List<User> getAllUsers() {
		User user = new User();

		return new ArrayList<>();
	}
}