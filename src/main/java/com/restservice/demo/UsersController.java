package com.restservice.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {
	
	//Get all users in Specific page
	//http://localhost:8080/users?page=5&limit=50
	@GetMapping
	public String getUsers(@RequestParam(value="page") int pageNo , @RequestParam(value="limit") int limitNo) //Query parameter
	{
		return "http Get request was sent for page:"+ pageNo + "and limit:"+ limitNo ;
	}
	
	@GetMapping(path="/{userID}") // Path Parameter
	public String getUsers(@PathVariable String userID)
	{
		return "http GetByID request was sent for userid:"+ userID;
	}
	
	@PostMapping
	public String CreateUser()
	{
		return "http Post request was send";
	}
	
	@PutMapping
	public String UpdateUser()
	{
		return "http Update request was send";
	}
	
	@DeleteMapping
	public String DeleteUser()
	{
		return "http Delete request was send";
	}

}
