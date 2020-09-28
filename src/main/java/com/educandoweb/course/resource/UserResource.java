package com.educandoweb.course.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController
@RequestMapping(value = "/Users")
public class UserResource {
    @GetMapping
	public ResponseEntity<User> findAll() {
		User u = new  User(1L, "Maria", "maria@yahoo.con", "99999999", "13480");
		return ResponseEntity.ok(u);

	}
}
