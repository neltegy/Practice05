package com.javaex.problem03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {
	
	public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    	List<String> list = new ArrayList<String>();
    	Goods[] goods_arr = new Goods[3];
    	int sum = 0; //모든상품의 갯수를 출력할 변수
    	System.out.println("상품 3개를 입력해주세요:");
    	for(int i = 0 ; i < 3 ; i++) {
    		list.add(sc.nextLine());
    		String str1 = list.get(0).split(" ")[0];
        	int in01 = Integer.parseInt(list.get(0).split(" ")[1]);
        	int in02 = Integer.parseInt(list.get(0).split(" ")[2]);
        	list.remove(0);
        	goods_arr[i] = new Goods(str1,in01,in02); //객체생성
    	}
    	for(int i = 0 ; i < 3 ; i++) {
    		goods_arr[i].goodsprint(); //객체배열들 출력
    		sum = sum + goods_arr[i].getCount(); //상품의 갯수들의 합구하기
    	}
    	System.out.println("모든 상품의 갯수는 "+sum+"개 입니다.");
    }

}
