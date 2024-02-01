package ch09.resolve07;

public class ArrayUtilityMain {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        
        // int 배열을 double 배열로 변환
        double[] doubleArray = ArrayUtility.intToDouble(intArray);
        System.out.println("Int 배열을 Double 배열로 변환:");
        
        // 변환된 double 배열 출력
        for (double num : doubleArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // double 배열을 int 배열로 변환
        double[] doubleValues = {1.1, 2.2, 3.3, 4.4, 5.5};
        int[] intResult = ArrayUtility.doubleToInt(doubleValues);
        System.out.println("Double 배열을 Int 배열로 변환:");
        
        // 변환된 int 배열 출력
        for (int num : intResult) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
