package ch09.extends03;

public class Father extends GrandFather{
	
	long money = 100000000000000000L;
	
	public Father(){
		System.out.println("Father 생성자");
	}
	
	public void wealth() {
		System.out.println("돈을 많이 벌었다ㅎㅎ");
	}
}
