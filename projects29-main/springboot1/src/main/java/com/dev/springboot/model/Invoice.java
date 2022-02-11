
package com.dev.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
	public class Invoice {

	    @Id
	    @GeneratedValue
	    private long id;
	    private String name;
	    private String location;
	    private Double amount;
	    
	    Invoice()
	    {

	   	    }
	    
	     public long getId()
	    {
	     return id;
	    }
	    
	    public void setId(long id)
	    {
	    	this.id= id;
	    }
	    
	    public String getName()
	    {
	    	return name;
	    }
	    
	    public void setName(String name)
	    {
	    	this.name = name;
	    }
	    
	    public String getlocation()
	    {
	    	return location;
	    }
	
	   public  void setlocation(String location)
	    {
	    	this.location = location;
	    }
	    
	   public double getamount()
	    {
	    	return amount;
	    }
	    
	    public void setamount(double amount)
	    {
	    	this.amount = amount;
	    }
	    
	}
	

