package ch04.primitive;

public class PrimitiveTypeEx {
	public static void main(String[] args) {
		// 아래 변수는 Stack에 생성되었다가
		// main의 영역을 벗어나면 Stack에서 사라진다.
		// 지역변수
		byte b = 10;
		char ch = 'A';
		short s = 10000;
		int i = 9999999;
		long l = 999999999999999999L;
		float f = 3.14f;
		double d = 3.14;
		System.out.printf("byte size : %d bit\n", Byte.SIZE);
		System.out.printf("byte size : %d bit\n", Character.SIZE);
		System.out.printf("byte size : %d bit\n", Short.SIZE);
		System.out.printf("byte size : %d bit\n", Integer.SIZE);
		System.out.printf("byte size : %d bit\n", Long.SIZE);
		System.out.printf("byte size : %d bit\n", Float.SIZE);
		System.out.printf("byte size : %d bit\n", Double.SIZE);
	}
}
