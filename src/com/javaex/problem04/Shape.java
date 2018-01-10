package com.javaex.problem04;

public abstract class Shape {
	int countSides;
	
	public Shape(int countSides){
		this.countSides = countSides;
	}
	public int getCountSides() {
		return countSides;
	}
	abstract double getArea(); // 넓이
	abstract double getPerimeter(); // 둘레 길이
}
