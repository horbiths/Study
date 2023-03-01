package ch12;

public class ShortCircuit {

	public static void main(String[] args) {
		// 단락 회로 평가 (short circuit evaluation) - 논리 연산에서 모든 항이 실행되지 않는 경우
		// 논리 곱 (&&)은 앞의 항의 결과가 false이면 뒤 항의 결과를 평가하지 않음
		// 논리 합(||) 앞의 항의 결과가 true이면 뒤 항의 결과를 평가하지 않음
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i); // 첫 항에서 결과가 false가 나왔으므로 연산하지 않아서 2가 출력된다.
		
		value = ((num1 = num1 + 10) < 10) || ((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i); // 첫 항에서 false가 나와서 뒤 항을 연산하여 4가 출력된다.
		
		
	}

}
