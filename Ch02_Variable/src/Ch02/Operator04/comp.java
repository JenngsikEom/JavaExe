package Ch02.Operator04;

public class comp {
	public static void main(String[] args) {
		int num0 = 100;
		int num1 = 10;
		int num2 = 100;
		
		boolean bVal = num0 > num1; // 100 > 10
		System.out.println(bVal);   // true
		bVal = num0 < num1;
		System.out.println(bVal);  // 100 < 10
		bVal = num0 == num2;       // false
		System.out.println(bVal);  // 100 == 100
		bVal = num0 >= num2;       
		System.out.println(bVal);
	}
}
