package com.sammika.demo;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	
	private String brand;
	private String cc;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCc() {
		return cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}
	
	public void status() {
		System.out.println("engine running");
	}
	

}
