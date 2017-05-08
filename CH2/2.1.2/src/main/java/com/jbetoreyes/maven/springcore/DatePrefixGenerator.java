package com.jbetoreyes.maven.springcore;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrefixGenerator implements PrefixGenerator {
	
	private DateFormat formatter;
	
	public void setPattern(String pattern){			// This setter would be used by spring without of the pattern variable
		this.formatter = new SimpleDateFormat(pattern);
	}

	public String getPrefix() {
		return formatter.format(new Date());
	}

}
