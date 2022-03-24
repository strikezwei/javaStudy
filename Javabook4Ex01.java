package ch04;

import java.util.Scanner;

public class Javabook4Ex01 {

	public static void main(String[] args) {

		// 다음 문장을 조건식으로 표현
		// 1-1 int형 변수 x가 10보다 크고 20보다 작을때 true인 조건식
//		int x;
		Scanner sc = new Scanner(System.in);
//		System.out.println("x를 입력");
//		x = sc.nextInt();
//			if(x>=10 && x<=20) {
//				System.out.println("true");
//			}else {
//				System.out.println("false");
//			}
		// 1-2 char형 변수 ch가 공백이나 탭이 아닐때 true인 조건식
//			char ch;
//			System.out.println("char입력");
//			ch = sc.nextLine().charAt(0);
//			System.out.println(ch);
//			if(ch == ' ' || ch == '\t') {
//				System.out.println("false");
//			}else {
//				System.out.println("true");
//			}
			
		// 1-3 char형 변수 ch가 'x'또는 'X'일때 true인 조건식
//			char ch;
//			System.out.println("ch입력");
//			ch = sc.nextLine().charAt(0);
//			if(ch == 'x' || ch =='X') {
//				System.out.println("true");
//			}else {
//				System.out.println("false");
//			}
		
		// 1-4 char형 변수 ch가 숫자('0'~'9')일때 true인 조건식
//			System.out.println(ch);
//			if('0'<=ch && ch <='9') {
//				System.out.println("true");
//			}else {
//				System.out.println("false");
//			}
			
		// 1-5 char형 변수 ch가 영문자(대문자 또는 소문자일때 )true인 조건식
//			if('a'<=ch || 'A' <= ch) {
//				System.out.println("true");
//			}else {
//				System.out.println("false");
//			}
			
		// 1-6 int형 변수  year가 400으로 나누어 떨어지거나 4로 나누어 떨어지고 100으로 나눠떨어지지 않ㅇ늘때 true인 조건식
//			int year;
//			System.out.println("year 입력");
//			year = sc.nextInt();
//			if((0 == year%400 || 0==year%4) && 0!=year%100 ) {
//				System.out.println("true");
//			}else {
//				System.out.println("false");
//			}

		// 1-7 boolean형 변수 powerOn이 false일때 true 인 조건식
//			System.out.println("powerOn입력");
//			boolean powerOn = sc.nextBoolean();
//			if(powerOn == false) {
//				System.out.println("ture");
//			}else {
//				System.out.println("false");
//			}
			
		// 1-8 문자열 참조변수 str이 "yes"일때 true인 조건식
		System.out.println("str입력");
		String str = sc.next();
		if(str.equals("yes")) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		
		
	sc.close();	
	}
}
