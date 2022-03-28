package ch04;


public class Javabook4Ex04 {
	public static void main(String[] args) {
		//1 + (-2) + 3 + (-4) + 5+...과 같은 식으로 계속 더해갔을때, 몇까지 더해야 총합이 100이상인가
		short x=0;
		short sum=0;
		while(100>=sum) {	
			if(0==x%2) {
				sum -=x;
				++x;
			}else {
				sum +=x;
				++x;
			}
			System.out.println("x의 값"+ x +", sum의값" + sum);
		}
	}
}



