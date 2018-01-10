package com.javaex.problem01;

import java.util.Scanner;

public class CalcApp {
    private int a;
    private int b;
    public void setValue(int a, int b) {}
	int calculate() { return 1; }
	
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
    	CalcApp[] arr = new CalcApp[4];
    	CalcApp ca_add = new Add();
    	CalcApp ca_sub = new Sub();
    	CalcApp ca_mul = new Mul();
    	CalcApp ca_div = new Div();
    	
    	arr[0] = ca_add;
    	arr[1] = ca_sub;
    	arr[2] = ca_mul;
    	arr[3] = ca_div;
    	
    	while(true) {
    		System.out.print(">> ");
        	String str1 = sc.nextLine();
        	if(str1.equals("/q")) {
        		System.out.println("종료합니다.");
        		break;
        	}
        	String[] str_arr = str1.split(" ");
        	if(str_arr[1].equals("+")) {
        		arr[0].setValue(Integer.parseInt(str_arr[0]), Integer.parseInt(str_arr[2]));
        		System.out.println(">>"+arr[0].calculate());
        	}else if(str_arr[1].equals("-")) {
        		arr[1].setValue(Integer.parseInt(str_arr[0]), Integer.parseInt(str_arr[2]));
        		System.out.println(">>"+arr[1].calculate());
        	}else if(str_arr[1].equals("*")) {
        		arr[2].setValue(Integer.parseInt(str_arr[0]), Integer.parseInt(str_arr[2]));
        		System.out.println(">>"+arr[2].calculate());
        	}else if(str_arr[1].equals("/")) {
        		arr[3].setValue(Integer.parseInt(str_arr[0]), Integer.parseInt(str_arr[2]));
        		System.out.println(">>"+arr[3].calculate());
        	}else {
        		System.out.println("알수없는연산입니다.");
        	}
    	}
    	
    	
    }
}
