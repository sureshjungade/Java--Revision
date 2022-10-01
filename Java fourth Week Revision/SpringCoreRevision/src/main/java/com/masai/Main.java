package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ApplicationContext ctx1 = new AnnotationConfigApplicationContext(AppConfig.class);
		A a11 = ctx1.getBean("a",A.class);
		A a12 = ctx1.getBean("a",A.class);
		A a1 = ctx.getBean("a",A.class);
		
		A a2 = ctx.getBean("a",A.class);
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a11);
		System.out.println(a12);
	}

}
