package ch15;

import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		int day;
		switch(month) {
		
			case 1 : // case 3 : case5 : case 7 : case 8 : case 10 : case 12 : 같은 케이스의 경우 옆으로 연달아 써도 된다.
				day = 31; //break를 왜 써야 하는가? break가 없으면 그 케이스에 해당해도 멈추지 않고 다음 케이스로 넘어가기 때문이다.
				break;
			case 2 : 
				day = 28;
				break;
			case 3 : 
				day = 31;
				break;
			case 4 : 
				day = 30;
				break;
			case 5 : 
				day = 31;
				break;
			case 6 : 
				day = 30;
				break;
			case 7 :
				day = 31;
				break;
			case 8 : 
				day = 31;
				break;
			case 9 : 
				day = 30;
				break;
			case 10 :
				day = 31;
				break;	
			case 11 : 
				day = 30;
				break;
			case 12 : 
				day = 31;
				break;
			default :
				System.out.println("존재하지 않는 달입니다.");
				day = -1;				
		}
		
		System.out.println(month + "월은 " + day + "일 입니다.");
	}

}
