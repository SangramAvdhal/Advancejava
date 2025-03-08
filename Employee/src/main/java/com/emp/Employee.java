package com.emp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="Employee Record")
public class Employee {
	
	@Id//peimary key
	@GeneratedValue(strategy =GenerationType.IDENTITY)//auto increment
	private int Eid;
	private String name;
	@Column(name="Jobe Role")
	private String role;
	private int MOBO;
	private String email;
	
	public Employee() {
		
	}

	public Employee(int eid, String name, String role, int mOBO, String email) {
		super();
		Eid = eid;
		this.name = name;
		this.role = role;
		MOBO = mOBO;
		this.email = email;
	}

	public int getEid() {
		return Eid;
	}

	public void setEid(int eid) {
		Eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getMOBO() {
		return MOBO;
	}

	public void setMOBO(int mOBO) {
		MOBO = mOBO;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [Eid=" + Eid + ", name=" + name + ", role=" + role + ", MOBO=" + MOBO + ", email=" + email
				+ "]";
	}
	
	

}