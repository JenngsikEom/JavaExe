package ch05.array08;

import java.util.Arrays;

// 3. 정수 배열 5개를 할당하고 
// System.Out.println(Array.toString(numArr));
// 로 배열을 출력했을때 거꾸로 출력되도록
// 배열의 값을 거꾸로 저장하세요.
public class Resolve03 {
	public static void main(String[] args) {
int[] numArr = {1, 2, 3, 4, 5}; // 원래 배열
        
        // 새로운 배열 생성
        int[] reversedArr = new int[numArr.length];
        
        // 원래 배열을 거꾸로 저장
        for (int i = 0; i < numArr.length; i++) {
            reversedArr[i] = numArr[numArr.length - 1 - i];
        }
        
        // 출력
        System.out.println("Original Array: " + Arrays.toString(numArr));
        System.out.println("Reversed Array: " + Arrays.toString(reversedArr));
	}
}
