package ch04;


public class Javabook4Ex05 {
	public static void main(String[] args) {
//		for(int i=0;i<=10;i++) {
//			for(int j=0;j<=i;j++) 
//				System.out.println("*");
//				System.out.println();
//		}
		
		System.out.println("===================================");
		int x=0;
		int y=0;
		while(x<=10) {
			while(y<=x) {
				System.out.println("*");
				System.out.println();
			}
			++x;
		}
		
	}
}



