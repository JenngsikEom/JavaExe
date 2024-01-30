package ch08.class02;
import java.util.Scanner;

public class RestrauntMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Restaurant rest = new Restaurant();
		rest.sc = sc;
		rest.name = "새마을 식당";
		rest.viewMenu();
		rest.selectFood();
		rest.deliveryFood();	
		
		Restaurant rest1 = new Restaurant();
		rest1.sc = sc;
		rest1.name = "낙원타코";
		rest1.viewMenu();
		rest1.selectFood();
		rest1.deliveryFood();	
		
		Restaurant rest2 = new Restaurant();
		rest2.sc = sc;
		rest2.name = "소호정";
		rest2.viewMenu();
		rest2.selectFood();
		rest2.deliveryFood();
		
		sc.close();
	}
}
