package ch03;
//함수 생성 연습
public class FuntionTest {

	
	public static int addNum(int num1, int num2) { //반환값이 int
		
		int result; // 이런 지역적으로 쓰는 변수를 지역 변수라고 하고, 스택 메모리에 저장된다.
		result = num1 + num2;
		return result;
	}
	
	public static void sayHello(String greeting) { //반환값이 없음 void
		
		System.out.println(greeting);
		
	}
	
	public static int calcSum() {
		
		int sum = 0;
		int i;
		
		for(i = 0; i <= 100; i++) {
			
			sum += i;
		}
		
		return sum;
		
	}
	
	public static void main(String[] args) {

		int n1 = 10;
		int n2 = 20;
		
		int total = addNum(n1, n2);
		System.out.println(total);
		
		sayHello("안녕하세요.");
		
		total = calcSum();
		System.out.println(total);
	}

}
