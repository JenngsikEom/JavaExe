package ch03.control06;

import java.util.Scanner;

public class SwitchEx {
	public static void main(String[] args) {
		
		
		int sel;
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 짜장면");
		System.out.println("2. 짬뽕");
		System.out.println("3. 탕수육");
		System.out.println("4. 유산슬");
		System.out.println("5. 유린기");
		System.out.println("선택 >>");
		sel = sc.nextInt();
		
		if(sel == 1)
		System.out.println("1. 짜장면이 나왔습니다.");
		else if(sel == 2)
		System.out.println("2. 짬뽕이 나왔습니다.");
		else if(sel == 3)
		System.out.println("3. 탕수육이 나왔습니다.");
		else if(sel == 4)
		System.out.println("4. 유산슬이 나왔습니다.");
		else if(sel == 5)
		System.out.println("5. 유린기가 나왔습니다.");
		else
		System.out.print("해당 번호의 메뉴가 없습니다. ");
		sc.close();
	}
}




