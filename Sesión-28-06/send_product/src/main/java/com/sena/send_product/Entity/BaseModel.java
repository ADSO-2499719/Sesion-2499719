package com.sena.send_product.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseModel {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "state", nullable = false)
	private Boolean state;
	
	@Column(name = "creation_at", nullable = false)
	private LocalDateTime creationAt;
	
	@Column(name = "update_at", nullable = true)
	private LocalDateTime updateAt;
	
	@Column(name = "delete_at", nullable = true)
	private LocalDateTime deleteAt;
	
	@Column(name = "creation_user", nullable = false)
	private Long creationUser;
	
	@Column(name = "update_user", nullable = true)
	private Long updateUser;
	
	@Column(name = "delete_user", nullable = true)
	private Long deleteUser;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getState() {
		return state;
	}

	public void setState(Boolean state) {
		this.state = state;
	}

	public LocalDateTime getCreationAt() {
		return creationAt;
	}

	public void setCreationAt(LocalDateTime creationAt) {
		this.creationAt = creationAt;
	}

	public LocalDateTime getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(LocalDateTime updateAt) {
		this.updateAt = updateAt;
	}

	public LocalDateTime getDeleteAt() {
		return deleteAt;
	}

	public void setDeleteAt(LocalDateTime deleteAt) {
		this.deleteAt = deleteAt;
	}

	public Long getCreationUser() {
		return creationUser;
	}

	public void setCreationUser(Long creationUser) {
		this.creationUser = creationUser;
	}

	public Long getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(Long updateUser) {
		this.updateUser = updateUser;
	}

	public Long getDeleteUser() {
		return deleteUser;
	}

	public void setDeleteUser(Long deleteUser) {
		this.deleteUser = deleteUser;
	}
		
}
