package com.exercicio.webservice.resouces;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.exercicio.webservice.entity.User;
import com.exercicio.webservice.entity.services.UserService;

@RestController
@RequestMapping(value="/user")
public class UserResource {

	private final UserService service;

	UserResource(UserService service) {
		this.service = service;
	}
	
	@GetMapping
	public ResponseEntity<List<User>> findAll () {
		
		List<User> u = new ArrayList<>(u=service.findAll());
		
		return ResponseEntity.ok().body(u);
		
	} 
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User>findById(@PathVariable Long id){
		User user = service.findById(id);
		return ResponseEntity.ok().body(user);
	}
	
	@PostMapping
	public ResponseEntity<User>insert(@RequestBody User user){
		user=service.insert(user);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId()).toUri();
		return ResponseEntity.created(uri).body(user);
	}
	
	@DeleteMapping(value="/{id}")
	public ResponseEntity<Void>deleteById(@PathVariable Long id){
		
		service.deleteById(id);
		
		return ResponseEntity.noContent().build();
	}
}
