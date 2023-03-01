package ch12;

public class RelationalTest {

	public static void main(String[] args) {

		int num1 = 5;
		int num2 = 3;
		
		boolean value = (num1 > num2); // num1이 num2보다 크다
		System.out.println(value); // value의 값을 출력하므로 true
		
		System.out.println(num1 < num2); // num1이 num2보다 작다고 돼있으니 false
		System.out.println(num1 >= num2); // nu1이 num2보다 크거나 같다인데 크다고 설정했으니 true
		System.out.println(num1 <= num2); // 마찬가지로 작거나 같다고 하니 false
		System.out.println(num1 == num2); // num1은 num2와 같지 않으므로 false
		System.out.println(num1 != num2); // 마찬가지로 서로 다르니 true !는 아니다를 의미
		
	}

}
