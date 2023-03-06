package ch17;

public class ForTest {
	public static void main(String[] args) {
		
		int count = 1;
		int sum = 0;
		
		for(int i = 0; i < 10; i++, count++) { //증감에 의해 이뤄지는 반복문은 for문이 훨씬 편하다.
			
			sum += count;
		}
		System.out.println(sum);
	 

		int num = 1;
		int total = 0;
		
		while(num <= 10) { //do while과 while문은 조건식의 결과나 변수가 true, false 값인 경우 주로 사용한다.
			
			total += num;
			num++;
		}
		
		System.out.println(total);
	}
}
