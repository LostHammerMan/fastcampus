package ch06;

public class Student {
	
	// 멤버 변수는 객체가 만들어지면 자동으로 초기화됨
	public int studentNumber;
	public String studentName;
	public int grade;
	
	
	public Student() {
		System.out.println("학생 생성");
	}
	
	// 매개 변수를 받아 생성시키고 싶은 경우
	public Student(int studentNumber, String studentName, int grade) {
		this.studentNumber = studentNumber; // this.멤버변수 = 매개변수 // 각 변수의 이름을 달리 정의하는 경우 이와는 무관
		this.studentName = studentName;
		this.grade = grade;
	}
	
	public String showStudentInfo() {
		return studentName + " 학생의 학번은 " + studentNumber + "이고, " + grade + " 학년입니다.";
	}
	
	
}
