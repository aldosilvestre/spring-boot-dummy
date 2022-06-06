package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserAccess {

	@JsonProperty("access_token")
	private String accessToken;
	@JsonProperty("is_admin")
	private Boolean isAdmin;
	private String username;
	
	public Boolean isIsAdmin() {
		return this.isAdmin;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public Boolean getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	
	
}
