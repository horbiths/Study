package ch19;

public class ContinueTest {

	public static void main(String[] args) {

		int num;
		for(num = 1; num <= 100; num++) {
			
			if((num % 3) != 0) continue; //조건이 참일 경우 무시하고 다음으로 넘기고 거짓일 경우 수행한다.
			
			System.out.println(num);
		}
	}

}
