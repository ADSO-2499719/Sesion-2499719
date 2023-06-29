package com.sena.send_product.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "city")
public class City extends BaseGeneric{
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "estate_id", nullable = false)
    private Estate estateId;

	public Estate getEstateId() {
		return estateId;
	}

	public void setEstateId(Estate estateId) {
		this.estateId = estateId;
	}	
}
