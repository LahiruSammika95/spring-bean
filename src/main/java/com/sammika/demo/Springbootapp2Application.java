package com.sammika.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springbootapp2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(Springbootapp2Application.class, args);
		
		Vehicle v1= context.getBean(Vehicle.class);
		Engine e1= context.getBean(Engine.class);
		e1.setCc("1000");
		e1.setBrand("BMW");
		v1.setColor("red");
		v1.setEngine(e1);
		
		System.out.println(v1.getColor());
		System.out.println(v1.getEngine().getBrand());
		v1.getEngine().status();
		v1.getGearbox().status();
		System.out.println(v1);
		
		Vehicle v2= context.getBean(Vehicle.class);
		v2.setColor("blue");
		
		System.out.println(v2.getColor());
		System.out.println(v1.getColor());
		System.out.println(v2);

	}

}
