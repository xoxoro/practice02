package com.javaex.practice;

import java.util.Scanner;

public class Ex04 {
		//나이를 입력받아 19세이상 65세 미만이면 "1번그룹" 그외에는 "2번그룹"
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요.");
		System.out.print("나이:");
		int age = sc.nextInt();
		
		if(age<65) {
			System.out.println("1번그룹");
		}
			
		else if(age>=19) {
			System.out.println("1번그룹");
		}
		
		else {
			System.out.println("2번그룹");
		}
		
		
		sc.close();

	}

}
