package com.sammika.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype")
//when you use prototype if we wouldn't initiate any object out of this class, Springboot will not create any bean/object 
//inside spring container. But if this class use singleton pattern, despite the initialization of the object Springboot 
//will create a bean/object inside spring container. You can figure out the difference by
//uncommenting this line of code above @Scope(value="prototype")
public class Vehicle {
	
	private int num_of_wheels;
	private String color;
	private String model;
	private Engine engine;
	@Autowired
	private Gearbox gearbox;


	public Vehicle() {
		System.out.println("vehicle created");
	}
	
	
	public int getNum_of_wheels() {
		return num_of_wheels;
	}
	public void setNum_of_wheels(int num_of_wheels) {
		this.num_of_wheels = num_of_wheels;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Gearbox getGearbox() {
		return gearbox;
	}
	public void setGearbox(Gearbox gearbox) {
		this.gearbox = gearbox;
	}
	
	

}
