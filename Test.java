package com.spring.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Book b1 = (Book) context.getBean("bk1");
		System.out.println(b1+"  Hashcode : "+b1.hashCode());
		//Book b2 = (Book) context.getBean("bk2");
		//System.out.println(b2+"  Hashcode : "+b2.hashCode());
		
		Employee emp1 = (Employee) context.getBean("emp1");
		System.out.println(emp1);
		


	}

}
