package ch08.class08;

// 과일을 구매하는 과일 구매자를 나타내는 클래스
public class FruitBuyer {
    int money;        // 과일 구매자의 보유 금액
    int numOfApple;   // 과일 구매자가 보유한 사과 개수
    
    // 생성자: 초기 보유 금액을 입력받아 과일 구매자 객체를 생성한다.
    public FruitBuyer(int money) {
        this.money = money;      // 초기 보유 금액을 설정한다.
        this.numOfApple = 0;     // 초기에는 사과를 하나도 보유하지 않는다.
    }
    
    // 과일을 구매하는 메서드
    public void buyApple(FruitSeller seller, int money) {
        this.numOfApple += seller.saleApple(money);  // 판매자로부터 구매한 사과 개수를 누적한다.
        this.money -= money;                         // 구매한 만큼 금액을 차감한다.
    }
    
    // 구매 결과 출력 메서드: 현재 과일 구매자의 상태를 출력한다.
    public void showBuyresult() {
        System.out.println("*** 과일 구매자의 현재 상황 ***");
        System.out.println("현재 잔액: " + money);
        System.out.println("사과 개수: " + numOfApple);
    }
}
