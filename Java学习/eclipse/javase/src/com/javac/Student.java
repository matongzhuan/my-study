package com.javac;

/**
 * 关于this关键字
 * 	1.翻译为：这个
 *	2.没有static的方法称为实例方法
 *	3.没有static的变量称为实例变量
 * @author matong
 *
 */
public class Student {
	String name;
	int no;
	int age;
	boolean sex;
	
	public	Student(){
		name="1";
		no=1;
		age=1;
		sex=true;
	}
	public Student(String name, int no, int age, boolean sex) {
		this.name = name;
		this.no = no;
		this.age = age;
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
}
