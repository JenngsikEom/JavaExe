package ch08.class09;

import java.util.Scanner;

public class Chineserestaurant {
	// 필드
	private String[] foods = {"짜장면", "짬뽕", "볶음밥",
							"우동", "깐풍기", "팔보채", "양장피"};
	private int selectNum;
	private Scanner sc = new Scanner(System.in);
	
	// 메서드
	public void viewMenu() {
		for(int i=0;i<foods.length;i++) {
			System.out.println(i + "." + foods[i]);
		}
	}
	public void selectFood() {
		System.out.print("어떤 음식을 선택하시겠습니까? >> ");
		selectNum = sc.nextInt();
	}
	public void deliveryFood() {
		String food = foods[selectNum];
		System.out.println(food + "이 나왔습니다.");
		System.out.println("맛있게 드세요 ^^");
	}
	public void keyboardEnd() {
		sc.close();
	}	
}
