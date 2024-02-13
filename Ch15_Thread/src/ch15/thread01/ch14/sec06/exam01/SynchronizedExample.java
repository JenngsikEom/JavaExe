package ch15.thread01.ch14.sec06.exam01;

/* 순서를 맞춰주는 동기화 기법
 * 2개의 스레드가 순서대로 1번씩 처리하는 동기화
 * */
public class SynchronizedExample {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1Thread user1Thread = new User1Thread();
		user1Thread.setCalculator(calculator);
		user1Thread.start();
		
		User2Thread user2Thread = new User2Thread();
		user2Thread.setCalculator(calculator);
		user2Thread.start();
	}
}
