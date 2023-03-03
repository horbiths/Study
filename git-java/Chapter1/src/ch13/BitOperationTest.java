package ch13;

public class BitOperationTest {

	public static void main(String[] args) {

		int num1 = 5;
		int num2 = 10;
		
		System.out.println(num1 | num2);
		System.out.println(num1 & num2);
		System.out.println(num1 ^ num2);
		System.out.println(~num1);
		
		System.out.println(num1 << 2); //num1을 복사해 와서 비트를 2번 옆으로 옮긴 것
		System.out.println(num1 <<= 2); //대입연산자 =를 입력하면 바뀐다
		System.out.println(num1);
		System.out.println(num1 >> 1);
	}

}
