package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {
		//switch~case문을 사용한다.
		//영문 소문자 이외의 입력값은 고려하지 않습니다.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벳 1글자(소문자)를 입력하세요");
		System.out.print("알파벳: ");
		String al = sc.nextLine();
		
		switch(al) {
		
			case "a" :
				
			case "e" :
								
			case "i" :
								
			case "o" :
				
			case "u" :
				System.out.println("모음입니다.");
				break;
				
			default :
				System.out.println("자음입니다.");
				break;
				
		}
		sc.close();
	}

}
