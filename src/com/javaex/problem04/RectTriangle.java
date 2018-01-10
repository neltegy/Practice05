package com.javaex.problem04;

import java.math.*;

public class RectTriangle extends Shape{
	private double width;
	private double height;
	
	RectTriangle(double w, double h){
		super(3);
		this.width = w;
		this.height = h;
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return (width*height)/2;
	}

	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return width + height + Math.sqrt((width*width)+(height*height));
	}
	
}
