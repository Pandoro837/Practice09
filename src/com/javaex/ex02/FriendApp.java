package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);	//스캐너 임포트
    	List<Friend> fList = new ArrayList<Friend>();
    	
		System.out.println("친구를 3명 등록해주세요");
		
		for(int i = 0; i < 3; i++) {
			Friend f = new Friend(sc.nextLine());
			fList.add(f);
		}
		sc.close();
		
		for(Friend f : fList) {
			f.showInfo();
		}
		
		
    	
    }

}
