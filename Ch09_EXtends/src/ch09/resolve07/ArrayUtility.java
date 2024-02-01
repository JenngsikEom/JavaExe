package ch09.resolve07;
public class ArrayUtility {
	
	/*3. 다음 두 개의 static메소드를 가진 ArrayUtility클래스를 만들어보고 사용해보세요
	  static double[] intToDouble(int[] source);	// int배열을 double배열로 변환
	  static int[] doubleToInt(double[] source);	// double배열을 int배열로 변환
	  */
	
    // int 배열을 double 배열로 변환
    public static double[] intToDouble(int[] source) {
        double[] result = new double[source.length];
        
        // 각 요소를 double로 변환하여 새 배열에 저장
        for (int i = 0; i < source.length; i++) {
            result[i] = (double) source[i];
        }
        return result; // 변환된 double 배열 반환
    }

    // double 배열을 int 배열로 변환
    public static int[] doubleToInt(double[] source) {
        int[] result = new int[source.length];
        
        // 각 요소를 int로 변환하여 새 배열에 저장
        for (int i = 0; i < source.length; i++) {
            result[i] = (int) source[i];
        }
        return result; // 변환된 int 배열 반환
    }
}
