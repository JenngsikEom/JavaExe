package ch03.for10;

import java.util.Scanner;

public class Resolve14 {

	public static void method0() {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		while(true) {
			System.out.println("정수 입력 (0은 합계 출력) >>");
			int num = sc.nextInt();
			if(num == 0)
				break;
			sum += num;
		}
		
	}

	public static void method1() {
	}

	public static void method2() {
	}
}
//Ctrl + Shift + F