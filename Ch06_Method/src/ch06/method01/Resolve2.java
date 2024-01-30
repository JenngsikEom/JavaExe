// 2. 두 개의 정수를 입력 받아서, 두 수의 차의 절대값을 계산하여 출력하는 메소드를 만들고
// 사용해보세요. 메서드 호출 시 전달되는 값의 순서와 상관없이
// 절대값이 계산되어서 출력되어야 합니다
package ch06.method01;

	import java.util.Scanner;

	public class Resolve2 {
	    // 두 수의 차의 절대값을 계산하여 출력하는 메서드
	    public static void printAbsoluteDifference(int num1, int num2) {
	        int difference = num1 - num2;
	        int absoluteDifference = Math.abs(difference);
	        System.out.println("두 수의 차의 절대값: " + absoluteDifference);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("첫 번째 정수 입력: ");
	        int firstNumber = scanner.nextInt();

	        System.out.print("두 번째 정수 입력: ");
	        int secondNumber = scanner.nextInt();

	        // printAbsoluteDifference 메서드 호출
	        printAbsoluteDifference(firstNumber, secondNumber);

	        scanner.close();
	    }
	}
