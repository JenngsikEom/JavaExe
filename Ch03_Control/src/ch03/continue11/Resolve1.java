package ch03.continue11;

public class Resolve1 {
	public static void main(String[] args) {
		int sum=0;
		
		for(int i=1;i<100;i++){			
			if(i%3==0) {
				System.out.printf(i + ", ");
				sum += i;
			}
		}
		System.out.println();
		
		System.out.println("1~100까지의 정수중에 3의 배수의 총합 :"
				+ sum);

	}
}
