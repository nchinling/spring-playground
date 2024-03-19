package com.example.applicationcontext.appcontextconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AppcontextconfigApplication {

	public static void main(String[] args) {
		//using xml approach
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
		Car car = (Car) context.getBean("car");
		car.getBrand();
		car.getColour();

		//Annotation approach
		// ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // HelloWorld obj = context.getBean(HelloWorld.class);
        // obj.getMessage();

        // Car car = context.getBean(Car.class);
        // car.getBrand();
        // car.getColour();

	}

}
