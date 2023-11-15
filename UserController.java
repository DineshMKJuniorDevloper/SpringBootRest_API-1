package com.example.Controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.User;
import com.example.service.UserService;

@RestController
@RequestMapping("/User_Register")
public class UserController {
	
	@Autowired
	UserService userService;
	
	
	
	
	
	@PostMapping("/Register")
	public User addData(@RequestBody User user)
	{
		return this.userService.addUserData(user);
	}
	
	
	
	
	@GetMapping("/getAlldata")
	public List<User> getData()
	{
		return this.userService.getAllData();
	}
	
	
	
	
	@GetMapping("/getAlldata/{id}")
	public Optional <User> getDataById(@PathVariable (value="id") Integer identity)
	{
		return this.userService.getDataId(identity);
	}
	
	
	
	
	
	@PutMapping("/update/{id}")
	public User UpdateRecord(@PathVariable (value="id") Integer identity,@RequestBody User user)
	{
		return this.userService.updateReco(identity, user);
	}
	
	
	
	
	
	@PatchMapping("/updatebyPatch/{id}")
	public User PatchRecordbyId(@PathVariable (value="id") Integer identity,@RequestBody Map<String,Optional> map)
	{
		return this.userService.PatchReco(identity, map);
	}
	
	
	
	
	
	
	@DeleteMapping("/delete/{sid}")
	public String User_Dele(@PathVariable (value="sid") Integer stdid)
	{
		return this.userService.deleteUser(stdid);
			
	}
	
	
	
	
}
