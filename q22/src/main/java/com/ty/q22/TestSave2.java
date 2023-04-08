package com.ty.q22;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSave2 {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("com/ty/q22/Config.xml");
		College c2=(College)c1.getBean("college");
		System.out.println(c2);
	}

}
