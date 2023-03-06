package ch15;

import java.util.Scanner;

public class SwitchCaseUpTest {

	public static void main(String[] args) {

		//java 14 부터는 Switch Expression이 지원된다.
		//개선된 switch문은 break문을 사용하지 않아도 된다.
		//화살표 case라벨, 다중 case라벨, switch연산식, yield 예약어 등의 기능이 추가되었다.
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		int day = switch (month) {
			case 1, 3, 5, 7, 8, 10, 12 -> {
				System.out.println("한 달은 31일 입니다.");
				yield 31; //반환값, 중괄호 안에서만 (switch 블록 내부에서만) 사용가능, 해당 switch 블록에 특정 값을 switch의 결과값으로 반환, 변수명으로 사용 가능
			}
			case 4, 6, 9, 11 -> {
				System.out.println("한 달은 30일 입니다.");
				yield 30;
			}
			case 2 -> {
				System.out.println("한 달은 28일 입니다.");
				yield 28;
			}
			default -> {
				System.out.println("존재하지 않는 달입니다.");
				yield 0;
			}
		};

		System.out.println(month + "월은" + day + "일 입니다.");
	}

}
