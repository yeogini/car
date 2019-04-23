package com.banana.car.tico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("car2")
public class Car2 {
//	@Autowired
	private Engine2 engine2;
	
	public void exec() {
		engine2.exec();
	}

	public Engine2 getEngine2() {
		return engine2;
	}

	public void setEngine2(Engine2 engine2) {
		this.engine2 = engine2;
	}
	
	
}
