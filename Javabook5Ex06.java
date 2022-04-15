package ch05;

import java.util.Scanner;

public class Javabook5Ex06 {
	public static void main(String[] args) {
		// 5-6 단어의 글자위치를 섞어서 보여주고 원래의 단어를 맞추는 예제
		// 실행결과와 같이 동작하도록 예제의 빈곳을 채우시오 pdf=답 221
		
		String[] words = {"television", "computer", "mouse", "phone"};
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<words.length;i++) {
			char[] question = words[i].toCharArray(); // String 을 char[]로 변환
			
			/*			char 배열 question에 담긴 문자의 위치를 임의로 바꾼다. 		*/
			
			int idx = (int)Math.random()*question.length+1;
			
			for(int j =0;j<question.length;j++) {
				int tmp;
				
				tmp = question[j];
				question[j] = question[idx];
				question[idx] = (char) tmp;
			}
			

			System.out.printf("Q%d. %s의 정답을 입력>", 
												i+ 1, new String(question));
			String answer = sc.nextLine();
			
			//trim()으로 answer의 좌우 공백 제거한후, equals로 word[i]와 비교
			if(words[i].equals(answer.trim())) {
				System.out.printf("맞았습니다.%n%n");
			}else {
				System.out.printf("틀렸습니다.%n%n");
			}
			
			//Q1 lvtsieeoin의 정답을 입력하세요>television
			//맞았습니다.
			//Q2 otepcumr의 정답을 입력> computer
			//맞았습니다.
			//Q3 usemo의 정답을 입력> asdf 
			//틀렸습니다.
			//Q4 ohpne의 정답을 입력하세요 > phone
			//맞았습니다.
		}
		sc.close();
	}
}


