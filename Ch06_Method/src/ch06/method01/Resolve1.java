//
//1. 2개의 정수를 입력받고 큰 값을 반환하는 메서드와
//   작은 값을 반환하는 메서드를 작성하고 사용하세요
package ch06.method01;

public class Resolve1 {
    // 큰 값을 반환하는 메서드
	public static int max(int num0, int num1) {
		int _max = 0;
		if(num0 > num1)
			_max = num0;
		else
			_max = num1;
		
		return _max;
		
	}
	public static int min(int num0, int num1) {
		int _min = 0;
		if(num0 > num1)
			_min = num1;
		else
			_min = num0;
		return _min;

	} 
	
	public static void main(String[] args) {
		int num0=1, num1=2;
		int result = max(num0, num1);
		System.out.println("큰 갑은: " + result);

	}
    }
