package com.Site.check.Site;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "Sites")
public class Site {
	@Id
    @GeneratedValue
	private Long ID;
	
	@NotBlank
	private String name;

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Site( @NotBlank String name) {
		this.name = name;
	}
	
	public Site() {
		
	}
	
	

}
