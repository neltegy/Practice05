package com.javaex.problem01;

public class Add extends CalcApp{
	private int a;
	private int b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	int calculate() {
		return a+b;
	}
	
}
