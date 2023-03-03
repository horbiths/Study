package ch13;

import java.util.Scanner;

public class ConitionTest {

	public static void main(String[] args) {

		int max;
		System.out.println("두 수를 입력 받아서 더 큰수를 출력하세요.\n");
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력 1 :");//입력을 받을 수 있게 하는 명령어
		int num1 = scanner.nextInt();//정수를 입력 받는 방법
		System.out.println("입력 2 :");
		int num2 = scanner.nextInt();
		
		max = (num1 > num2)? num1 : num2; // num1이 num2 보다 크면 num1을 출력 아니면 num2를 출력
		System.out.println(max);
		
	}

}
