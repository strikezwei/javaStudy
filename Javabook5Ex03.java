package ch05;


public class Javabook5Ex03 {
	public static void main(String[] args) {
		// 5-3 배열 arr에 담긴 모든값을 더하는 프로그램을 완성
		
		int [] arr = {10,20,30,40,50};
		int sum = 0;
		
		for(int i = 0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
			sum += arr[i];
		}
		
		
		System.out.println("sum = "+ sum );
	}
}

