package ch14;

import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int sale_price = scanner.nextInt();
		
		if(sale_price == 5) {
			System.out.println("반값 세일!");
		}
		else if(sale_price <= 10){
			System.out.println("특별 세일!");
		}
		else {
			System.out.println("잘못된 값입니다.");
		}
	}

}
