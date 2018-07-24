package com.fil.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fil.classes.BeanConfiguration;
import com.fil.classes.OuterClass;

public class BeanDemo {

	public static void main(String args[]){
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(BeanConfiguration.class);
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("mybeans.xml");
		
		OuterClass outer1 = context.getBean("outer",OuterClass.class);
		OuterClass outer2 = context.getBean("outer",OuterClass.class);
		System.out.println(outer1 == outer2);
		System.out.println(outer1.getInner().getValue());
	
		
		
		
	}
}
