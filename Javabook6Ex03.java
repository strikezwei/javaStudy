package ch06;


public class Javabook6Ex03 {
	public static void main(String[] args) {
		// 6-3 연습문제 6-1에서 정의한 Student클래스에 다음과 같이 정의된 두개의 메서드 getTotal()과 getAverage()를 추가하시오
		
		Student2 s = new Student2();
		s.name="홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름 : " + s.name);
		System.out.println("총점 : " + s.getTotal());
		System.out.println("평균 : " + String.format("%.1f", s.getAverage()));
		
		
	}
}

class Student2 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	
	
	int getTotal() {
		int getTotal=0;
		getTotal = this.kor+this.eng+this.math;
		return getTotal;
	}
	float getAverage() {
		float getAverage=0;
		getAverage = (float)getTotal()/3;
		return getAverage;
	}
	

}