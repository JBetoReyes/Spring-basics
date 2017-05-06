package com.jbetoreyes.maven.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args){
		ApplicationContext context = new GenericXmlApplicationContext("beans.xml");
		
		Product aaa = (Product) context.getBean("aaa");
		Product cdrw = (Product) context.getBean("cdrw");
		
		System.out.println(aaa);
		System.out.println(cdrw);
	}
}
