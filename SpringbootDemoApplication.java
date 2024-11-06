package com.telusko.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootDemoApplication.class,args);
		/*alien obj= new alien();
		obj.code();*/
		//Now without creating object using the new keyword we will add dependencies and call the class
		alien obj = context.getBean(alien.class);
		obj.code();
	}

}
