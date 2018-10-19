package org.pyarts.didemo;

import org.pyarts.didemo.controllers.ConstructorInjectedController;
import org.pyarts.didemo.controllers.MyController;
import org.pyarts.didemo.controllers.PropertyInjectedController;
import org.pyarts.didemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
		System.out.println(ctx.getBean(MyController.class).hello());
		System.out.println(myController.hello());
	}
}
