package ch06;


public class Javabook6Ex02 {
	public static void main(String[] args) {
		// 6-2 다음과 같은 실행결과를 얻도록 student클래스에 생성자와 info()를 추가하시오
		Student s = new Student("홍길동",1,1,100,60,76);
		
		String str = s.info();
		System.out.println(str);
	}
}
	class Student {
		String name;
		int ban;
		int no;
		int kor;
		int eng;
		int math;
		int sum;
		float average;
		
		public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		int sum = kor + eng + math;
		this.sum = sum;
		
		float average = (float)sum/3;
		this.average = average;
		}
		
//		int sum() {
//			int sum = kor + eng + math;
//			return sum;
//		}
//		
//		double average() {
//			float average = (float)sum()/3;
//			return average;
//		}
		

		String info() {

			return name+", "+ ban+", " + no+", " + kor + ", " +	eng + ", " + math +", " + sum +", "+String.format("%.1f",average)
			;
		}
	}