package com.springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectDTO {
	private int customerId;
	
	private String customerName;
	
	private String customerAddress;
	
	private long mobile;
}
