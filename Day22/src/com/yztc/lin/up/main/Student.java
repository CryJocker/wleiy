package com.yztc.lin.up.main;

import java.io.Serializable;

public class Student  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7188342685418047985L;
	private String name;
	private int age;
	private double money;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public Student(String name, int age, double money) {
		super();
		this.name = name;
		this.age = age;
		this.money = money;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", money=" + money + "]";
	}

}
