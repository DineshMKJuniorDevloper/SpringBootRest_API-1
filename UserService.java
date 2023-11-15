package com.example.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Exception.ResourceNotFoundException;
import com.example.Model.User;
import com.example.Repo.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo userRepo;
	
	//Post method
	public User addUserData(User user)
	{
		return this.userRepo.save(user);
		
	}
	
	
	
	//GetMethod-by All
	public List<User> getAllData()
	{
		return this.userRepo.findAll();
	}
	
	//GetMethod -by Id
	public  Optional<User> getDataId(Integer id)
	{
		return this.userRepo.findById(id);
	}
	
	
	
	
	  
	//Delete Method
	public String deleteUser(Integer sid)
	{
		

		this.userRepo.deleteById(sid);
		return "User Removed Successfully";
		
	}
	
	
	//put method
	public User updateReco(Integer id,User user)
	{
		  User olduser = this.userRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("User Data Not Found"));
	
		  olduser.setName(user.getName());
		  olduser.setEmail(user.getEmail());
		  olduser.setFatherName(user.getFatherName());
		  olduser.setMotherName(user.getMotherName());
		  olduser.setAddress(user.getAddress());
		  olduser.setPincode(user.getPincode());
		  
		  return this.userRepo.save(olduser);
	}
	
	
	
	
	
	//Patch method
	
	public User PatchReco(Integer id, Map<String, Optional> map)
	{
		
		User userdb = userRepo.findById(id).get();
		
		for(Map.Entry<String, Optional> hm : map.entrySet()) {
			 
			String st = hm.getKey();
			
			
			if(st.equals("name")) 
			{
				Optional<Object> ob = hm.getValue();
				String st1 = ob.map(Object::toString).orElse(null);
				userdb.setName(st1);
			}
			
			
			if(st.equals("email")) 
			{
				Optional<Object> ob = hm.getValue();
				String st1 = ob.map(Object::toString).orElse(null);
				userdb.setEmail(st1);
			}
			
			if(st.equals("fatherName")) 
			{
				
				Optional<Object> ob = hm.getValue();
				String st1 = ob.map(Object::toString).orElse(null);
				userdb.setFatherName(st1);
			}
			
			
			
			if(st.equals("motherName")) 
			{
				Optional<Object> ob = hm.getValue();
				String st1 = ob.map(Object::toString).orElse(null);
				userdb.setMotherName(st1);;
			}
			
			
			
			if(st.equals("address")) 
			{
				
				Optional<Object> ob = hm.getValue();
				String st1 = ob.map(Object::toString).orElse(null);
				userdb.setAddress(st1);
			}
			
			if(st.equals("pincode")) 
			{
				Optional<Integer> ob = hm.getValue();
				Integer obj = Integer.valueOf(ob.get());
				userdb.setPincode(obj);
			}
			
			
		}
		
		return userRepo.save(userdb);
	}
	
	
	
	}
