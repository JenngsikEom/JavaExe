package ch09.extends02;

public class ExtendsMain {
	
	public static void main(String[] args) {
		Child child = new Child();
		child.handsome();
		child.wealth();
		child.play();
		
		System.out.println("잘생김 점수: " + child.handsomeScore);
		System.out.println("돈 :" + child.money);
		System.out.println("인생 :" + child.day);
	}
}
