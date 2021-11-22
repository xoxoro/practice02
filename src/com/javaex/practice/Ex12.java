package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {
		//기호,숫자1,숫자2 순서로 입력받습니다.
		//기호는 (+ - * / ) 4가지 입니다.
		//입력된 내용으로 계산하여 결과값을 출력합니다.
		//나눗셈의 경우 분모가 0이면 "계산할 수 없습니다"를 출력합니다.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("출력되는 내용을 입력하세요");
		System.out.print("기호: ");
		String a = sc.nextLine();
		System.out.print("숫자1: ");
		double num1 = sc.nextDouble();
		System.out.print("숫자2: ");
		double num2 = sc.nextDouble();
		
		
		switch(a) {
			case "+" :
				System.out.println("결과는: "+(num1+num2));
				break;//여기서 브레이크를 안쓰면 break가 있는곳까지 계산하면서 내려감
				
			case "-" :
				System.out.println("결과는: "+(num1-num2));
				break;
		
			case "*" :
				System.out.println("결과는: "+(num1*num2));
				break;
				
			case "/" :
				
				if(num2==0) 
				{
					System.out.println("계산할 수 없습니다.");
				}
				
				else
				{
					System.out.println("결과는: "+(num1/num2));
				
				}
				break;
				
			default:
				System.out.println("계산할 수 없는 기호입니다.");
				break;
			
		
		 }
		
		
		sc.close();
		
	}

}
