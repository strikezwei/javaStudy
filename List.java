package algorism;

import java.util.Scanner;

public class List {

	public static void main(String[] args) {
		// {10 20 30 40 50}scanner을 이용한 입력값
		// 1 [0 10 0 0 0]
		// 2 [0 10 20 0 0]
		// 3 [0 10 20 30 0]
		// 4 [0 10 20 30 40]

		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		int max=0;
		int min=0;


		for(int i =0 ;i<a.length;i++) {
			System.out.print("a배열" + i+"번째 입력>");
			try {
			a[i] = sc.nextInt();
			} catch(Exception e) {
				if(0 <= a[i]) {
					a[i] = 0;
				}
			}			
			if(10 == a[i] || 20==a[i] || 30 == a[i]|| 40 == a[i] || 50 == a[i]) {
				System.out.println(a[i]);
			}else {
				a[i] = 0;
				System.out.println(a[i]);
			}

			if(a.length == i+1) {
				System.out.println("비교 시작");
				for(int x = 0; x<a.length;x++) {
						if(a[x]>max) {
							max = a[x];
						}else {
							min = a[x];
						}
				}
				System.out.println("제일 큰 값  = " + max);
				System.out.println("제일 작은 값  = " + min);

			}


		}
		sc.close();

	}

}
