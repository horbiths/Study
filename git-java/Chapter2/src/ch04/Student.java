package ch04;

public class Student { //학생 클래스 속성은 멤버변수, 메서드 만들기

	public int studentID;
	public String studentName;
	public String address;
	
	public void showStudentInfo() {
		
		System.out.println(studentID + "학번의 이름은 " + studentName + " 이고, 주소는 " + address + "입니다.");
	}

	public String getStudentName() {
		return studentName;
	} // 학생의 이름을 가져오는 메서드
	
	public void setStudentName(String name) {
		studentName = name;
	} // 학생의 이름을 변경하는 메서드
}
