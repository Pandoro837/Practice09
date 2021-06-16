package com.javaex.ex04;

public class Rectangle extends Shape implements Resizeable {
	
//	필드
	private double width;
	private double height;
	
//	생성자
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
//	메소드 일반
	public double getArea() {
		double result;
		result = width * height;	//사각형의 넓이
		return result;
	}
	
	public double getPerimeter() {
		double result;
		result = (width + height) * 2;	//사각형의 둘레
		return result;
	}
	
	public void resize(double s) {
		this.width = width * s;
		this.height = height * s;
	}
}