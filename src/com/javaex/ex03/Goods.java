package com.javaex.ex03;

public class Goods {
	
	private String name;
	private int price;
	private int count;

	public Goods(String _info) {
		String[] goodsInfo = _info.split(","); //_info의 내용을 ","로 구분하여 배열로 만든다

		this.name = goodsInfo[0];
		//배열에 든 문자열을 int 값으로 변경하여 저장
		this.price = Integer.parseInt(goodsInfo[1]);
		this.count = Integer.parseInt(goodsInfo[2]);
	}
	
	public int getCount() {
		return this.count;
	}
	
	//	객체의 정보를 출력
	public void showInfo() {
		System.out.println(this.name + "(가격:" + this.price + "원)이 " + this.count + "개 입고 되었습니다.");
	}

}
