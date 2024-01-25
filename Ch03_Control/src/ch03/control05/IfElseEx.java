package ch03.control05;

import java.util.Scanner;

public class IfElseEx {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("봄");
		System.out.println("여름");
		System.out.println("가을");
		System.out.println("겨울");
		System.out.println("선택 >>");
		
		String sel = sc.nextLine();
		Switch(sel) {
		case "봄":
			System.out.println("새싹이 자라난다");
		
		}	
	}
}




