package ch03.continue11;

public class Resolve2 {
	public static void main(String[] args) {
		for(int i=1;i<=5; i++) {  // 행의 변화
			for(int j=1; j<=i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
	}
}
