package ch04;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(); //Student 하나를 생성하라는 뜻 이렇게 생성되는 객체를 인스턴스라고 부른다.
		//인스턴트에 Student에 만들어 놓은 맴버변수와 메서드를 이용해서 값을 설정
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "서울 강남구";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentID = 54321;
		studentKim.studentName =  "Kim";
		studentKim.address = "창원 의창구";
		
		studentKim.showStudentInfo();
	}
}
