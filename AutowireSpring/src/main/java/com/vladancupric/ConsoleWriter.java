package com.vladancupric;

import org.springframework.stereotype.Component;

@Component

public class ConsoleWriter implements LogWriter {

	public void write(String text) {
		// TODO Auto-generated method stub
		System.out.println(text);

	}

}
