package ch08.class09;
//4. 노래를 나타내는 Song이라는 클래스를 설계하세요.
//<필드>
//노래제목 title
//가수    artist
//앨범제목 album
//작곡가  composer
//노래가 발표된 연도 year
//노래가 속한 앨범에서의 트랙 번호를 나타내는 track
//
//<메서드>
//노래의 정보를 저장하는 setSongInfo(...) : 관련된 매개변수를 인자로 넘겨줌
//노래의 정보를 나타내는 show()
//
//<main 실행>
//ABBA의 "Dancing Queen"노래를 Song객체로 생성하고
//Show()로 출력하세요

import ch08.class06.Human;

public class SongMain {
	
	public static void viewInfo(Human human) {
		System.out.println("이름 :" + human.getName());
		System.out.println("나이 :" + human.getAge());
		System.out.println("학점 :" + human.getScore());	
	}
	
	public static void main(String[] args) {
//		Human human = new Human();
//		human.name = "홍길동";
//		human.age = 24;
//		human.score = 4.5;
		
		Human human = new Human();
		
		human.setName("홍길동");
		human.setAge(24);
		human.setScore(4.5);
		
		viewInfo(human);
		
		/* 중간에 많은 처리/연산이 있었다.
		 * 그러다 age나 score값의 음수가 들어갔다.
		 * */
		
//		human.age = -10;
//		human.score = -20.9;
		
		human.setAge(-10);
		human.setScore(-20.9);
		
		viewInfo(human);
	}
}
