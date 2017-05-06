package com.jbetoreyes.maven.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args){
		ApplicationContext context = new GenericXmlApplicationContext("beans.xml");
		SequenceGenerator sequenceGenerator = (SequenceGenerator) context.getBean("SequenceGenerator");
		
		System.out.println(sequenceGenerator.getSequence());
		System.out.println(sequenceGenerator.getSequence());
	}
}	
