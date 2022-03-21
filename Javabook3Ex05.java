package ch03;

public class Javabook3Ex05 {

	public static void main(String[] args) {
		int num = 0;
		String result="";
		
		if(num == 0) {
			result ="0";
		}else if(num < 0) {
			result = "음수";
		}else if(num > 0) {
			result = "양수";
		}
		
		System.out.println(result);

	}

}
