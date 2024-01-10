package com.springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Customer")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectEntity {
	public ProjectEntity(String customerName, String customerAddress, long mobile) {
		super();
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.mobile = mobile;
	}

	@Id
	@Column(name = "customer_id", length = 50)
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private int customerId;
	
	@Column(name = "customer_name", length = 50)
	private String customerName;
	
	@Column(name = "customer_address", length = 60)
	private String customerAddress;
	
	@Column(name = "mobile", length = 12)
	private long mobile;
}
