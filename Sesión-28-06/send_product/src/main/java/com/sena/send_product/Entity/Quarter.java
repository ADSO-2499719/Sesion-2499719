package com.sena.send_product.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "quarter")
public class Quarter extends BaseGeneric{
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "commune_id", nullable = false)
    private Commune communeId;

	public Commune getCommuneId() {
		return communeId;
	}

	public void setCommuneId(Commune communeId) {
		this.communeId = communeId;
	}	
}
