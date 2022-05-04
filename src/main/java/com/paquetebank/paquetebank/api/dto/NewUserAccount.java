package com.paquetebank.paquetebank.api.dto;

public class NewUserAccount {
	private String name;
	private String cpfNif;
	public String getName() {
		return name;
	}
	public void setNome(String name) {
		this.name = name;
	}
	public String getCpfNif() {
		return cpfNif;
	}
	public void setCpfNif(String cpfNif) {
		this.cpfNif = cpfNif;
	}
}
