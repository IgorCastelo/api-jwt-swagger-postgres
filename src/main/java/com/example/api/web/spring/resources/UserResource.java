package com.example.api.web.spring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.web.spring.entities.User;
import com.example.api.web.spring.services.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
		
		  @Autowired
		  private UserService service;
		  @Operation(description = "Busca todods os alunos")
		  @ApiResponses(value = {
				  @ApiResponse(responseCode = "200", description = "Reotrna a lista completa de alunos"),
				  @ApiResponse(responseCode = "400", description = "Lista não encontrada")
		  })
		  @GetMapping
		  public ResponseEntity<List<User>> findAll(){
			   List<User> list = service.findAll();
			   return ResponseEntity.ok().body(list);
		  } 
	}