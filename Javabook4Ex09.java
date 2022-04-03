package ch04;


public class Javabook4Ex09 {
	public static void main(String[] args) {
		// int 타입의 변수 num이 있을때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성
		// 만일 변수 num의 값이 12345라면, '1+2+3+4+5'의 결과인 15를 출력

		int num=12345;
		int sum = 0;

		String str= num+"";
		System.out.println(str);
		for(int i=0;i<str.length();i++) {
			int x = str.charAt(i);
			sum+= x-'0';
		}	
		System.out.println("sum = " + sum);
	}
}

