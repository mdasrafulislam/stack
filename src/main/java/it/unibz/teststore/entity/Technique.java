package it.unibz.teststore.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Technique {
	
	@Id
	@GeneratedValue
	private Integer id;

	@Size(min =1)
	private String name;
	
	@Size(min =1)
	private String description;
	
	
	public void setId(Integer id){
		this.id=id;
	}
	
	public Integer getId() {
	    return id;
	}
	
	public String getName() {
		  return name;
	}

	public void setName(String name) {
		  this.name = name;
	}
	
	public String getDescription() {
		  return description;
	}

	public void setDescription(String description) {
		  this.description = description;
	}

}
