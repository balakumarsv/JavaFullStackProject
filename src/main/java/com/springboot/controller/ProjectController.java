package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dto.ProjectDTO;
import com.springboot.dto.ProjectSaveDTO;
import com.springboot.dto.ProjectUpdateDTO;
import com.springboot.serviceimpl.ProjectServiceImpl;



@RestController
@CrossOrigin
@RequestMapping("api/v1/customer")
public class ProjectController {
	
	@Autowired
	private ProjectServiceImpl impl;
	@PostMapping(value = "/save")
	public String saveCustomer(@RequestBody ProjectSaveDTO projectSaveDTO) {
		String id = impl.addCustomer(projectSaveDTO);
		return id;

	}
	
	@GetMapping(value = "/getAllCustomer")
	public List<ProjectDTO> getAllCustomers(){
		
		return impl.getAllCustomers();
		
	}
	
	@PostMapping(value = "/update")
	public String updateCustomerService(@RequestBody ProjectUpdateDTO projectUpdateDTO) {
		return impl.updateCustomers(projectUpdateDTO);
	}
	
	 @DeleteMapping(value = "/deletecustomer/{id}")
	    public String deleteCustomer(@PathVariable int id)
	    {
	        boolean deletecustomer = impl.deleteCustomer(id);
	        return "deleted";
	    }
}
