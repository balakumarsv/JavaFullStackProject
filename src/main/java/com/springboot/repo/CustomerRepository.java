package com.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.springboot.entity.ProjectEntity;

@EnableJpaRepositories
@Repository
public interface CustomerRepository extends JpaRepository<ProjectEntity, Integer> {
	
}
