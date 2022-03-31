package ch04;


public class Javabook4Ex06 {
	public static void main(String[] args) {
		//�ΰ��� �ֻ����� �������� ���� ���� 6�� �Ǵ� ��� ����� ���� ���
		 
//		 for(int x=1;x<=6;x++) {
//			 for(int y=1;y<=6;y++) {
//				 if(6==(x+y)){
//					 System.out.println("x : "+ x + "+" +" y:" + y + "=" + (x+y));
//				 }else {
//					 System.out.println(x + "+" + y + "=" + (x+y));
//				 }
//			 }
//		 }
		 int x=1;
		 while(x<=6) {
			 int y=1;
			 while(y<=6) {		 
				 if(6==(x+y)){
					 System.out.println("x : "+ x + "+" +" y:" + y + "=" + (x+y));
					 y++;
				 }else {
					 System.out.println(x + "+" + y + "=" + (x+y));
					 y++;
				 }
			
			 }
			 
			 x++;}
	}
}



