package com.javaex.ex04;

public class RectTriangle extends Shape {

//	필드
	private double width;
	private double height;
	
//	생성자
	public RectTriangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	
//	메소드 일반
	public double getArea() {
		double result;
		result = (width * height) / 2;	//삼각형의 넓이
		return result;
	}
	
	public double getPerimeter() {
		double result;
		result = width + height + Math.sqrt((width * width) + (height * height));
		return result;
	}
	
}