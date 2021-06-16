package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);			//스캐너 임포트
    	List<Goods> gList = new ArrayList<Goods> ();	//리스트 생성
    	int iCount = 0;
    	
    	System.out.println("상품을 입력해주세요");
    	
    	while(true) {
    		String goodsInfo = sc.nextLine();	//상품의 종류, 재고, 가격을 ","로 구분
    	   
    	//상품정보 입력, "q"일때 종료
    		if(goodsInfo.equals("q")) {
    			sc.close();
    			break;
    		} else {								//q가 아니라면, ggoods 객체를 생성하여 List에 add
    			Goods goods = new Goods(goodsInfo);
    			gList.add(goods);
    		}
    	}

       //출력
       for(Goods goods : gList) {	//goods로 gList의 각 객체를 받아서 출력
    	   goods.showInfo();
	   }
       
       //재고 총합 출력
       
       for(int i = 0; i < gList.size(); i++) {
    	   
    	   iCount+= gList.get(i).getCount();
       }
       
       System.out.println("모든 상품의 갯수는 " + iCount + "개 입니다.");
    }

}
