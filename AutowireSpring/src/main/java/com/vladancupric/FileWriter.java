package com.vladancupric;

import org.springframework.stereotype.Component;

@Component
public class FileWriter implements LogWriter {

	public void write(String text) {
		// TODO Auto-generated method stub
		System.out.println("Writing to File " + text);

	}

}
