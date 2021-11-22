package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {
		//사번(양의정수)를 입력하면 팀을 확인할수있다.
		/* 사번을 3으로 나누어서 나머지가 0이면 "A팀", 1이면 "B팀", 2이면 "C팀"으로 구분한다.
		   (이때 0은 고려하지않음) */
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("사번(정수)를 입력해주세요");
	System.out.print("사번: ");
	int num = sc.nextInt();
	
	
	if(num%3==0) {
	System.out.println("A팀입니다.");
	}
	
	else if(num%3==1) {
	System.out.println("B팀입니다.");
	}
	
	else if(num%3==2){
	System.out.println("C팀입니다.");
	}
	
	else {
	System.out.println("잘못입력하셨습니다.");
	}
	
	sc.close();
		
		

	}

}
