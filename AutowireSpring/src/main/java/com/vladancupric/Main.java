package com.vladancupric;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");

		Logger logger = (Logger) context.getBean("logger");
		logger.writeConsole("Hello, I am a developer");
		logger.writeFile("Hello, I am a Java Developer");

		((FileSystemXmlApplicationContext) context).close();

	}

}
