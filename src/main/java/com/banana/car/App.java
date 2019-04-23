package com.banana.car;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.banana.car.tico.Car;
import com.banana.car.tico.Car2;
import com.banana.car.tico.Car3;
import com.banana.car.tico.Engine;
import com.banana.car.tico.Engine2;
import com.banana.car.tico.ICar;
import com.banana.car.tico.item;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
/*        Car car = new Car();
        Engine engine = new Engine();
        car.setEngine(engine);
        car.exec();*/
        
		/*
		 * ApplicationContext ac = new
		 * ClassPathXmlApplicationContext("application_context.xml"); Car car =
		 * (Car)ac.getBean("c"); car.exec();
		 */
        
		
//		  ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class); 
//		  Car car = ac.getBean("car", Car.class);
//		  car.exec();
		 
    	
		/*
		 * AbstractApplicationContext factory = new
		 * GenericXmlApplicationContext("application_context.xml");
		 * 
		 * Car2 car2 = (Car2)factory.getBean("car2");
		 * car2.setEngine2(factory.getBean("Engine2", Engine2.class)); car2.exec();
		 * factory.close();
		 */
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("application_context.xml");
    	ICar car = context.getBean("car3", Car3.class);
    	car.run();
    	
    	item item = new item();
    	String test = item.toString();
    	System.out.println(test);
    }
}
