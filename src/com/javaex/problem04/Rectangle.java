package com.javaex.problem04;

public class Rectangle extends Shape implements Resizeable{
	private double width;
	private double height;
	
	Rectangle(double w, double h){
		super(4);
		this.width = w;
		this.height = h;
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return width*height;
	}

	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return (width+height)*2;
	}

	@Override
	public void resize(double s) {
		// TODO Auto-generated method stub
		width = width * s;
		height = height * s;
	}
}
