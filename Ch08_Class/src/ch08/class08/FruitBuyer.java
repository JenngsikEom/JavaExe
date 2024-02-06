package ch08.class08;

// 과일을 구매하는 과일 구매자를 나타내는 클래스
public class FruitBuyer {
	int money;
	int numOfApple;
	
	public FruitBuyer(int money) {
		this.money = money;
		this.numOfApple = 0;
	}
	public void buyApple(FruitSeller seller, int money) {
		this.numOfApple += seller.saleApple(money);
		this.money -= money;
	}
	public void showBuyresult() {
		System.out.println("*****구매자의 현재 상태*****");
		System.out.println("사과 개수 : " + numOfApple );
		System.out.println("현재 잔액 : " + money);
	}
}