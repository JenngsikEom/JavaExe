package ch05.array08;

public class Resolve02 {
//	Resolve1, Resolve2로 작성하세요
//	1. 정수 배열 5개를 할당하고
//	   Arrays.sort를 활용해서 최소값과 최대값을 얻으세요
	public static void main(String[] args) {
		int[] num = new int[] {1, 2, 3, 4, 5};
		int max = num[0];
		for(int i=1 ; i<num.length ; i++) {
			if(num[i]>max) {
				max = num[i];
				
			}
		}	
		System.out.println(max);
		
		int[] num1 = new int[] {1, 2, 3, 4, 5};
		int mini = num[0];
		for(int i=1; i<num1.length ; i++) {
			if(num[i]<mini) {
				mini = num1[i];
				
			}
		}	
		System.out.println(mini);
	}
}