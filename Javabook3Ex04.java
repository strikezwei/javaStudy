package ch03;

public class Javabook3Ex04 {

	public static void main(String[] args) {
		
		int numOfApples = 123;  // 사과의 개수
		int sizeOfBucket = 10;  //바구니의 크기 (바구니에 담을수있는 사과의 개수)
		double result = (double)numOfApples/sizeOfBucket;
		double numOfBucket = (Math.ceil(result));   //모든 사과를 담는데 필요한 바구니 개수
		
		System.out.println("필요한 바구니수 : " + numOfBucket);
	}

}
