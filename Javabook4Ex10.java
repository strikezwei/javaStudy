package ch04;

import java.util.Scanner;

public class Javabook4Ex10 {
	public static void main(String[] args) {
		// 다음은 숫자맞추기 게임을 작성한것. 1과 100사이의 값을 반복적으로 입력해서 컴퓨터가 생각한 값을 맞히면 게임이 끝
		// 사용자가 값을 입력하면, 컴퓨터는 자신이 생각한 값과 비교해서 결과를 알려준다. 
		// 사용자가 컴퓨터가 생각한 숫자를 맞히면 게임이 끝나고 몇 번만에 숫자를 맞혔는지 알려준다.
		
		//1에서 100사이의 임의의 값을 얻어서 answer에 저장한다.
		int answer = (int)(Math.random()*100)+1;
		int input = 0; // 사용자 입력을 저장할 공간
		int count = 0; // 시도횟수를 세기위한 변수
		
		
		Scanner sc = new Scanner(System.in);
		
		do {
			count++;
			System.out.println(count+"회차");
			System.out.print("1과 100사이 값을 입력 : ");
			input = sc.nextInt();//압력 받은 값을 변수 input에 저장
			if(input == answer) {
				System.out.println("승리! "+answer+"회차만에 승리");
				break;
			}else {
				System.out.println("아닙니다.");
			}
			
			
		}while(true);
		sc.close();
	}
}

