package com.javaex.practice;

import java.util.Scanner;

public class Ex06 {
		//두개의 숫자를 입력받아 큰수와 작은수를 분류하여 출력하라.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자2개를 입력해주세요");
		System.out.print("숫자1:");
		int n1 = sc.nextInt();
		System.out.print("숫자2:");
		int n2 = sc.nextInt();
		
		
		if(n1>n2) {
		System.out.print("큰수: "+n1+"\t작은수: "+n2+"입니다.");
		}
		
		else {
		System.out.print("큰수: "+n2+"\t작은수: "+n1+"입니다.");
		}
		
		sc.close();

	}

}
