//1. String 배열을 10명의 이름으로 초기화하고 순서대로 출력하세요
package ch05.array04;
import java.util.Arrays;
public class Resolve1 {
	public static void main(String[] args ) {
		String[] names = {"가", "나", "다", "라", "마", "바", "사"};
		
		for (int i=0;i<names.length;i++)
		System.out.print(names[i]);
	}
}
