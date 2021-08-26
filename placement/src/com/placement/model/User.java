package com.placement.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="placement_details")
public class User {
	@Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 @Column(name="id")
	 protected int id;
	 
	 @Column(name="name")
	 protected String name;
	 
	 @Column(name="department")
	 protected String department;
	 
	 @Column(name="emailid")
	 protected String emailid;
	 
	 public User() {
	 }
	 
	 public User(String name, String department, String emailid) {
	  super();
	  this.name = name;
	  this.department = department;
	  this.emailid = emailid;
	 }

	 public User(int id, String name, String department, String emailid) {
	  super();
	  this.id = id;
	  this.name = name;
	  this.department = department;
	  this.emailid = emailid;
	 }

	 public int getId() {
	  return id;
	 }
	 public void setId(int id) {
	  this.id = id;
	 }
	 public String getName() {
	  return name;
	 }
	 public void setName(String name) {
	  this.name = name;
	 }
	 public String getdepartment() {
	  return department;
	 }
	 public void setdepartment(String department) {
	  this.department = department;
	 }
	 public String getemailid() {
	  return emailid;
	 }
	 public void setemailid(String emailid) {
	  this.emailid = emailid;
	 }

}
