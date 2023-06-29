package com.sena.send_product.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseGeneric extends BaseModel {

	@Column(name = "code", nullable = false, length = 20)
	private String code;
	
	@Column(name = "name", nullable = false, length = 80)
	private String name;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}		
}
