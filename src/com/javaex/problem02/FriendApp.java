package com.javaex.problem02;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendApp {
	public static ArrayList<String> al = new ArrayList<String>();
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("친구3명 등록해 주세요.");
		for (int i = 0; i < 3; i++) {
			al.add(sc.nextLine()); //세번의 입력을 받음
		}
		for (int k = 0; k < 3; k++) {
			for (int i = 0; i < 3; i++) {
				al.add(al.get(0).split(" ")[i]); //어레이리스트의 0번째값을 잘라서 넣어줌
			}
			al.remove(0); // 다쓴 0번째값을 삭제해줌 어레이리스트의 0번째 공간이 비워져서 뒤에값들이 저절로 땡겨짐
		}

		Friend[] fri_arr = new Friend[3]; // 객체배열 선언
		for(int i = 0 ; i < 3 ; i++) { //객체배열을 메모리에 적재(초기화)
			fri_arr[i] = new Friend();
		}
		int cnt0 = 0;
		int cnt1 = 0,cnt2 = 1,cnt3 = 2;
		while (true) { //객체들의 필드값들을 셋팅해줌
			fri_arr[cnt0].setName(al.get(cnt1));
			fri_arr[cnt0].setHp(al.get(cnt2));
			fri_arr[cnt0].setSchool(al.get(cnt3));
			
			cnt1 = cnt1 + 3;
			cnt2 = cnt2 + 3;
			cnt3 = cnt3 + 3;
			cnt0++;
			if(cnt0 == 3) {
				break ;
			}
		}
		fri_arr[0].showInfo();
		fri_arr[1].showInfo();
		fri_arr[2].showInfo();
	}
}
