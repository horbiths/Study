package ch10;

public class ConstantTest {

	public static void main(String[] args) {
		//상수 (변하지 않는 수)
		final int MAX_NUM = 100;
		final int MIN_NUM;
		
		MIN_NUM = 0;
		//MAX_NUM = 20; 오류걸림 상수는 바꿀 수 없음
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
	}

}
