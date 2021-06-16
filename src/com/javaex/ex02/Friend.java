package com.javaex.ex02;

public class Friend {

    private String name;
    private String hp;
    private String school;

    public Friend(String f_Info) {
    	String[] f = f_Info.split(" ");	//입력받은 정보를 공백으로 구분
    	this.name = f[0];	//이름 입력
    	this.hp = f[1];		//전화번호 입력
    	this.school = f[2];	//학교 정보 입력
    }
    
    public void showInfo() {
    	System.out.println("이름:" + this.name + " 핸드폰:" + this.hp + " 학교:" + this.school);
    }

	@Override
	public String toString() {
		return "Friend [name=" + name + ", hp=" + hp + ", school=" + school + "]";
	}
    
    

}
