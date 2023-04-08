package com.ty.q11;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSave {
public static void main(String[] args) {
	ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("com/ty/q11/Config.xml");
	Branch b=(Branch)c1.getBean("branch");
	System.out.println(b);
}
}
