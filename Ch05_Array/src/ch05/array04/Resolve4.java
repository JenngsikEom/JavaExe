//4. int배열을 10개 생성하세요.
//int배열에 3의 배수를 차례대로 저장하세요.
//그리고 거꾸로 출력하세요.
////int배열에 3의 배수를 차례대로 저장하세요.
////그리고 거꾸로 출력하세요.
package ch05.array04;

public class Resolve4 {
	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		
		for(int i=0;i<numArr.length;i++) {
			numArr[i] = 3*(i+1);
		}
		
		System.out.println(numArr);
		
		for(int i=numArr.length-1;i>=0;i--) {
			System.out.printf(numArr[i] + " ");
		}
	}

}