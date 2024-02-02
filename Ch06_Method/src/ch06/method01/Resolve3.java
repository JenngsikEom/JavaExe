package ch06.method01;

public class Resolve3 {
    // 주어진 두 정수 사이의 숫자들의 누적합을 반환하는 메서드
    public static int total(int num0, int num1) {
        int sum = 0;
        // num0부터 num1까지 반복하면서 누적합을 계산
        for (int i = num0; i <= num1; i++) {
            sum += i;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        // total 메서드를 사용하여 누적합을 구하고 출력
        int result = total(1, 100);
        System.out.println("누적합은 " + result);
        
        int result1 = total(10, 20);
        System.out.println("누적합은 " + result1);
        
        int result2 = total(1, 1000);
        System.out.println("누적합은 " + result2);
    }
}
