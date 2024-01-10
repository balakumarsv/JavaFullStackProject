package com.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.dto.ProjectDTO;
import com.springboot.dto.ProjectSaveDTO;
import com.springboot.dto.ProjectUpdateDTO;

@Service
public interface ProjectService {
	String addCustomer(ProjectSaveDTO projectSaveDTO);
	List<ProjectDTO> getAllCustomers();
	String updateCustomers(ProjectUpdateDTO projectUpdateDTO);
	boolean deleteCustomer(int id);
}
