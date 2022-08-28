package ch09;

public class SubjectTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(123, "이순신");
		studentLee.setKoreaSubject("국어", 100);
		studentLee.setMathSubject("수학", 99);
		
		Student studentKim = new Student(233, "김유신");
		studentLee.setKoreaSubject("국어", 30);
		studentLee.setMathSubject("수학", 50);
		
		studentLee.showScore();
		studentKim.showScore();
	}
}
