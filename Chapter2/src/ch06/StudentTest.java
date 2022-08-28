package ch06;

public class StudentTest {
	public static void main(String[] args) {
		
		Student studentLee = new Student();
		Student studentKim = new Student(54321, "김좌진", 1);
		
		System.out.println(studentLee.showStudentInfo());
		System.out.println(studentKim.showStudentInfo());
	}

}
