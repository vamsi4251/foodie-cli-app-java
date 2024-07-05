package com.exemple.foodiecli.model;

import java.util.Objects;

public class Dish {

	
	 /*
    add the following properties
    --------------------------------------
    Datatype                  variable
    --------------------------------------
    String                      id
    String                      name
    String                      description
    double                      price
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
    private String description;
    private double price;
    
    
    // Getter for dishId
	public String getId() {
		return id;
	}
	
	// Setter for dishId
	public void setId(String id) {
		this.id = id;
	}
	
	// Getter for name
	public String getName() {
		return name;
	}
	
	// Setter for name
	public void setName(String name) {
		this.name = name;
	}
	

	// Getter for Description
	public String getDescription() {
		return description;
	}
	
	// Setter for Description
	public void setDescription(String description) {
		this.description = description;
	}
	
	// Getter for Price
	public double getPrice() {
		return price;
	}
	
	// Setter for Price
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(description, id, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dish other = (Dish) obj;
		return Objects.equals(description, other.description) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}

	@Override
	public String toString() {
		return "Dish [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + "]";
	}
	
	
	
	
}
