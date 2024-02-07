package ch09.hasa08;

public class Gun {
	private int bullet;
	
	public Gun(int bullet) {
		this.bullet = bullet;
	}
	public void shot() {
		if(bullet>0) {
			System.out.println("빵");
		}else {
			System.out.println("철컥...");
		}
	}
}