package ch04;


public class Javabook4Ex02 {

	public static void main(String[] args) {
		//1부터 20까지의 정수중에서 2또는 3의 배수가 아닌 수의 총합
		int x;
		int sum =0;
		for(x=1;x <=20;x++) {
			
			if(0 == x%2 || 0 ==x%3) {
				sum += 0;
			}else {
				sum+=x;
				System.out.println("x값 = "+ x +", 합 = " + sum);
			}
		
		}
	}
}
