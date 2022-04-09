package ch05;


public class Javabook5Ex04 {
	public static void main(String[] args) {
		// 5-4 2차열 배열 arr에 담긴 모든값의 총합과 평균을 구하는 프로그램을 완성
		
		int[][] arr = {
				{5,5,5,5,5}
				, {10,10,10,10,10}
				, {20,20,20,20,20}
				, {30,30,30,30,30}
		};
		
		int total = 0;
		float average=0;
		int count=0;
		
		for(int i = 0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				total+=arr[i][j];
				count++;
				
			}
			System.out.println(i+"번째"+"total= " + total);
		}
		average=(float)total/count;
		
		
		System.out.println("total = " + total);
		System.out.println("average = " + average);
	}
}

