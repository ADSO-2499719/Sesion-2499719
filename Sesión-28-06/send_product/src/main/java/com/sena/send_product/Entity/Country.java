package com.sena.send_product.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "country")
public class Country extends BaseGeneric{
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "continent_id", nullable = false)
    private Continent continentId;

	public Continent getContinentId() {
		return continentId;
	}

	public void setContinentId(Continent continentId) {
		this.continentId = continentId;
	}	
}
