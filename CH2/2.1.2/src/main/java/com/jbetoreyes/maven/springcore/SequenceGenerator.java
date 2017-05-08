package com.jbetoreyes.maven.springcore;

public class SequenceGenerator{
	private String prefix;
	private String suffix;
	private int initial;
	private int counter;
	
	public SequenceGenerator(){}

	public SequenceGenerator(String prefix, String suffix, int initial) {
		super();
		this.prefix = prefix;
		this.suffix = suffix;
		this.initial = initial;
	}
	
	public SequenceGenerator(String prefix, String suffix) {
		super();
		this.prefix = prefix;
		this.suffix = suffix;
	}
	
	public SequenceGenerator(String prefix, int initial) {
		super();
		this.prefix = prefix;
		this.initial = initial;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public int getInitial() {
		return initial;
	}

	public void setInitial(int initial) {
		this.initial = initial;
	}
	
	public synchronized String getSequence(){
		StringBuffer buffer = new StringBuffer();
		buffer.append(prefix);
		buffer.append(initial + counter++);
		buffer.append(suffix);
		return buffer.toString();
		
	}
}