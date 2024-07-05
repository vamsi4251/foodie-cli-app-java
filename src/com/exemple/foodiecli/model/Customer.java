package com.exemple.foodiecli.model;

import java.util.Objects;

public class Customer {
	
	 /*
    add the following properties
    --------------------------------------
    Datatype                  variable
    --------------------------------------
    String                      id
    String                      name
    String                      email
    String                      password
     */

    /*
    1. All the fields should be private
    2. Create only no-arg constructor
    3. Create Getters and Setter methods
    4. Override hashCode() and equals() methods
    5. Override toString() methods
     */
	
	
	private String id;
    private String name;
    private String email;
    private double password;
    
    
    // Getter for customerId
	public String getId() {
		return id;
	}
	
    // Setter for customerId
	public void setId(String id) {
		this.id = id;
	}
	
    // Getter for name
	public String getName(){
		return name;
	}
	
    // Setter for name
	public void setName(String name) {
		this.name = name;
	}
	
    // Getter for email
	public String getEmail() {
		return email;
	}
	
    // Setter for email
	public void setEmail(String email) {
		this.email = email;
	}
	
    // Getter for password
	public double getPassword() {
		return password;
	}
	
    // Setter for password
	public void setPassword(double password) {
		this.password = password;
	}
	
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(email, id, name, password);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(email, other.email) && Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(password) == Double.doubleToLongBits(other.password);
	}
    
    

}
