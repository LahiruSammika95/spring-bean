package com.sammika.demo;

import org.springframework.stereotype.Component;

@Component
public class Gearbox {
	
	private String model;
	private int num_of_fwd_gears;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getNum_of_fwd_gears() {
		return num_of_fwd_gears;
	}
	public void setNum_of_fwd_gears(int num_of_fwd_gears) {
		this.num_of_fwd_gears = num_of_fwd_gears;
	}
	
	public void status() {
		System.out.println("gear box working");
	}

}
