package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {
		//키와 몸무게를 입력받아 표준체중을 계산한 후 저체중,표준,과체중을 구분하여 출력하라.
		//표준체중 = (키=100)*0.9
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("키와 몸무게를 입력해주세요.");
		System.out.print("키: ");
		int height = sc.nextInt();
		System.out.print("몸무게: ");
		int weight = sc.nextInt();
		
		double standard = (double)(height-100)*0.9;
		
		
		if(weight<standard) {
		System.out.println("저체중 입니다.");
		System.out.println("표준체중:"+ standard);
		}
		
		else if(weight==standard) {
		System.out.println("표준 입니다.");
		System.out.println("표준체중:"+ standard);
		}
		
		else {
		System.out.println("과체중 입니다.");
		System.out.println("표준체중:"+ standard);
		}
		
		
		sc.close();

	}

}
