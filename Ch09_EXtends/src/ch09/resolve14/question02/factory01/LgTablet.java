package ch09.resolve14.question02.factory01;

import ch09.resolve14.question02.ITablet;

public class LgTablet implements ITablet {

	@Override
	public void movie() throws InterruptedException {
		System.out.println("LgTablet - 영화화면이 깨끗하고 선명하다");
		Thread.sleep((long)(Math.random()*500) + 500);
	}

	@Override
	public void music() throws InterruptedException {
		System.out.println("LgTablet - 음질이 매우 뛰어나다");
		Thread.sleep((long)(Math.random()*500) + 500);
	}

	@Override
	public void readBook() throws InterruptedException {
		System.out.println("LgTablet - 독서에 최적화 되어있다.");
		Thread.sleep((long)(Math.random()*500) + 500);
	}

}
