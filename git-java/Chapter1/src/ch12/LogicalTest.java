package ch12;

public class LogicalTest {

	public static void main(String[] args) {

		// && (논리 곱) 두 항이 모두 참인 경우에만 결과 값이 참이다.
		// || (논리 합) 두 항 중 하나의 항만 참이면 참이다.
		// ! (부정) 단항 연산자로 참인 경우는 거짓으로, 거짓인 경우는 참으로 바꾼다.
		
		int num1 = 10;
		int num2 = 20;
		
		boolean flag = (num1 > 0) && (num2 > 0); // num1은 10이고 num2는 20이므로 두 항이 모두 참이다. true
		System.out.println(flag);
		
		flag = (num1 < 0) && (num2 > 0); // 왼쪽 항이 거짓이므로 false
		System.out.println(flag);
		
		flag = (num1 > 0) || (num2 > 0); // 두 항 모두 참이므로 true
		System.out.println(flag);
		
		flag = !(num1 > 0); // 참이나 !를 사용하여서 false
		System.out.println(flag);
		
	}

}
