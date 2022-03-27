package ch04;


public class Javabook4Ex03 {

	public static void main(String[] args) {
		//1 + (1+2) + (1+2+3) + ... (1+2+3+..+10)의 결과 1+3+6+10+15 , 1+4+6
		
		int x;
		int sum =0;
		int result=0;
		for(x=1;x<=10;x++) {
			sum = sum+x;
			result += sum;
			System.out.println("x의 값 "+x +" , sum의값"+sum + ", result의 값"+ result);
		}

	}
}
