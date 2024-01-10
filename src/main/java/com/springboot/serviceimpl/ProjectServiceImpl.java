package com.springboot.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.dto.ProjectDTO;
import com.springboot.dto.ProjectSaveDTO;
import com.springboot.dto.ProjectUpdateDTO;
import com.springboot.entity.ProjectEntity;
import com.springboot.repo.CustomerRepository;
import com.springboot.service.ProjectService;

@Component
public class ProjectServiceImpl implements ProjectService {
	
	@Autowired
	private CustomerRepository repository;
	@Override
	public String addCustomer(ProjectSaveDTO projectSaveDTO) {
		ProjectEntity projectEntity = new ProjectEntity(projectSaveDTO.getCustomerName(), projectSaveDTO.getCustomerAddress(), projectSaveDTO.getMobile());
		repository.save(projectEntity);
		return projectEntity.getCustomerName();
		
	}
	@Override
	public List<ProjectDTO> getAllCustomers() {
		List<ProjectEntity> findAll = repository.findAll();
		List<ProjectDTO>projectDTO = new ArrayList<>();
		
		for (ProjectEntity a : findAll) {
			
			ProjectDTO projectDTO1 = new ProjectDTO(a.getCustomerId(), a.getCustomerName(), a.getCustomerAddress(), a.getMobile());
			
			projectDTO.add(projectDTO1);
			
		}
		return projectDTO;
	}
	@Override
	public String updateCustomers(ProjectUpdateDTO projectUpdateDTO) {
		if (repository.existsById(projectUpdateDTO.getCustomerId())) {
			ProjectEntity projectEntity = repository.getById(projectUpdateDTO.getCustomerId());
			
			projectEntity.setCustomerName(projectUpdateDTO.getCustomerName());
			projectEntity.setCustomerAddress(projectUpdateDTO.getCustomerAddress());
			projectEntity.setMobile(projectUpdateDTO.getMobile());
			
			repository.save(projectEntity);
		} else {
			System.out.println("customer Does No Exist");
		}
		return null;
	}
	@Override
	public boolean deleteCustomer(int id) {
		if(repository.existsById(id)) {
			repository.deleteById(id);
		}
		else
        {
            System.out.println("customer id not found");
        }

        return true;
	}

}
