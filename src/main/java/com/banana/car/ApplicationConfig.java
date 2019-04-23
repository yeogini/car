package com.banana.car;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.banana.car.tico.Car;
import com.banana.car.tico.Engine;

@Configuration
public class ApplicationConfig {
	
	@Bean
	public Car car(Engine e) {
		Car c = new Car();
		c.setEngine(e);
		return c;
	}
	
	@Bean
	public Engine engine() {
		return new Engine();
	}
	
	
	
}
