package ch03.for10;

public class Resolve6 {
	public static void main(String[] args) {
		int i=1, sum=0;
		do {
			sum = sum + i;
			System.out.print(i + " : " + sum);
			System.out.println();
			i++;
		}
		while(i <= 10);
		
		System.out.println("1~10의 합은 " + sum);
	}	
	}

