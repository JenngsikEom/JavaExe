package ch05.array08;

import java.util.Arrays;

//1. 정수 배열 5개를 할당하고
//Arrays.sort를 활용해서 최소값과 최대값을 얻으세요
public class Resolve01 {
	public static void main(String[] args) {
		int[] numArr = {10, 99, 2, 78, 32};
		int min, max;
		min=max=numArr[0];
		for(int i=1;i<numArr.length;i++) {
			if(min>numArr[i])
				min=numArr[i];
			
			if(max<numArr[i])
				max=numArr[i];
		}
		
		System.out.println("최소값: " + min);
		System.out.println("최대값: " + max);
	}
}





