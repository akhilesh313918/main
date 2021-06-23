package com.srpingboot.learning.srpingbootlearning.filterController;

import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("SomeNewBeanFilter")
public class SomeNewBean {
	private String value1;
	private String value2;
	private String value3;
	
	public SomeNewBean(String value1, String value2, String value3) {
		super();
		this.value1 = value1;
		this.value2 = value2;
		this.value3 = value3;
	}

	public SomeNewBean() {
		// TODO Auto-generated constructor stub
	}

	public String getValue1() {
		return value1;
	}

	public void setValue1(String value1) {
		this.value1 = value1;
	}

	public String getValue2() {
		return value2;
	}

	public void setValue2(String value2) {
		this.value2 = value2;
	}

	public String getValue3() {
		return value3;
	}

	public void setValue3(String value3) {
		this.value3 = value3;
	}
	
	

}