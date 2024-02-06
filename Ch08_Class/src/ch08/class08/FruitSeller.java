package ch08.class08;

// 과일을 판매하는 과일 판매자를 나타내는 클래스
public class FruitSeller {
    private int numOfApple;         // 사과 개수
    private int saleMoney;          // 판매 금액
    final int APPLE_PRICE = 1000;   // 사과 가격(상수)
    
    // 생성자: 초기 사과 개수를 입력받아 과일 판매자 객체를 생성한다.
    public FruitSeller(int numOfApple) {
        this.numOfApple = numOfApple;
    }
    
    // 사과를 판매하는 메서드
    public int saleApple(int money) {
        int num = money / APPLE_PRICE;  // 고객이 지불한 금액으로부터 판매될 사과 개수를 계산한다.
        numOfApple -= num;              // 판매한 사과 개수만큼 재고에서 차감한다.
        saleMoney += money;             // 판매한 금액을 총 판매금액에 더한다.
        return num;                     // 판매된 사과 개수를 반환한다.
    }
    
    // 판매 결과 출력 메서드: 현재 과일 판매자의 상태를 출력한다.
    public void showSaleResult() {
        System.out.println("*** 과일 판매자의 현재 상황 ***");
        System.out.println("남은 사과: " + numOfApple);
        System.out.println("판매 수익: " + saleMoney);
    }
}