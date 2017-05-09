package com.jbetoreyes.maven.springcore;

import java.text.DecimalFormat;
import java.util.Formatter;
import java.util.List;
import java.util.Map;

public class SequenceGenerator{
	
	private PrefixGenerator prefixGenerator;
	private String prefix;
	private String suffix;
	private List<Object> suffixes;
//	private Map<Object, Object> suffixes;
	private int initial;
	private int counter;
	
	public SequenceGenerator(){}
	
	public SequenceGenerator(PrefixGenerator prefixGenerator){
		this.prefixGenerator = prefixGenerator;
	}

	public SequenceGenerator(String prefix, String suffix, int initial) {
		super();
		this.prefix = prefix;
		this.suffix = suffix;
		this.initial = initial;
	}
	
	public SequenceGenerator(int initial, String suffix) {
		super();
		this.initial = initial;
		this.suffix = suffix;
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
		
	public PrefixGenerator getPrefixGenerator() {
		return prefixGenerator;
	}

	public void setPrefixGenerator(PrefixGenerator prefixGenerator) {
		this.prefixGenerator = prefixGenerator;
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
	
	
	
//	public List<Object> getSuffixes() {
//		return suffixes;
//	}
//
//	public void setSuffixes(List<Object> suffixes) {
//		this.suffixes = suffixes;
//	}
	
//	public Map<Object, Object> getSuffixes() {
//		return suffixes;
//	}
//
//	public void setSuffixes(Map<Object, Object> suffixes) {
//		this.suffixes = suffixes;
//	}

	public List<Object> getSuffixes() {
		return suffixes;
	}

	public void setSuffixes(List<Object> suffixes) {
		this.suffixes = suffixes;
	}
	
	public synchronized String getSequence(){
		StringBuffer buffer = new StringBuffer();
		buffer.append(prefix);
		buffer.append(initial + counter++);
		
		DecimalFormat formatter = new DecimalFormat("0000");
		for(Object suffix : suffixes){
			buffer.append("-" );
			buffer.append(formatter.format((Integer) suffix));
		}
		return buffer.toString();
		
	}

//	public synchronized String getSequence(){
//		StringBuffer buffer = new StringBuffer();
//		buffer.append(prefix);
//		buffer.append(initial + counter++);
//		for(Map.Entry suffix : suffixes.entrySet()){
//			buffer.append("-" + suffix.getKey() + "@" + suffix.getValue());
//		}
//		return buffer.toString();
//		
//	}

//	public synchronized String getSequence(){
//		StringBuffer buffer = new StringBuffer();
//		buffer.append(prefixGenerator.getPrefix());
//		buffer.append(initial + counter++);
//		for(Object suffix : suffixes){
//			buffer.append("-" + suffix);
//		}
//		return buffer.toString();
//		
//	}
	
//	public synchronized String getSequence(){
//		StringBuffer buffer = new StringBuffer();
//		buffer.append(prefix);
//		buffer.append(initial + counter++);
//		for(Object suffix : suffixes){
//			buffer.append("-" + suffix);
//		}
//		return buffer.toString();
//		
//	}
}