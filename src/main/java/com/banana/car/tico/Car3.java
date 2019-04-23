package com.banana.car.tico;

import org.springframework.stereotype.Component;

@Component
public class Car3 extends Car2 implements ICar, IShip {
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("인터페이스 카 작동");
		
	}
	
	@Override
	public void exec() {
		
	}

	
	public void sail() {
		// TODO Auto-generated method stub
		
	}

}
