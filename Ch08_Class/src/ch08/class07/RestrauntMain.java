package ch08.class07;

import java.util.Scanner;

// 레스토랑 메인 클래스
public class RestrauntMain {
    // 메인 메서드
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner 객체 생성
        
        // 새마을 식당 객체 생성 및 메뉴 출력, 음식 선택, 음식 배달
        Restaurant rest = new Restaurant(sc, "새마을 식당", 
                                         new String[] {"연탄불고기", "소금구이", "차돌박이"});
        rest.viewMenu();
        rest.selectFood();
        rest.deliveryFood();
        
        // 낙원타코 객체 생성 및 메뉴 출력, 음식 선택, 음식 배달
        Restaurant rest1 = new Restaurant(sc, "낙원타코", 
                                          new String[] {"낙원파히타", "김치 브리또", "불고기퀘사디아"});
        rest1.viewMenu();
        rest1.selectFood();
        rest1.deliveryFood();
        
        // 소호정 객체 생성 및 메뉴 출력, 음식 선택, 음식 배달
        Restaurant rest2 = new Restaurant(sc, "소호정", 
                                          new String[] {"안동국시", "국밥", "메밀묵"});
        rest2.viewMenu();
        rest2.selectFood();
        rest2.deliveryFood();
        
        sc.close(); // Scanner 객체 닫기
    }
}
