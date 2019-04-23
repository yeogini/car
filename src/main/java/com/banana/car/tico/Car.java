package com.banana.car.tico;

public class Car {
	private Engine engine;
	
	public Car() {
		System.out.println("car 생성");
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void exec() {
		getEngine().exec();
	}
	
	
}
