
public class ExceptionTest02 {

	public static void main(String[] args) {
		
		int intArray[] = {100, 90, 80};
		String strArray[] = {"100", "90", "3.1415"};
		int j = 0;
		
		try {
			for(int i = 0; i < 3; i++)
				System.out.println("intArray[" + i + "] = " + intArray[i]);
			for(j = 0; j < 3; j++) {
				int m = Integer.parseInt(strArray[j]);
				System.out.println("strArray의 " + j + "번째가 숫자로 변환된 값은 " + m + "입니다.");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스를 벗어났습니다.");
		} catch (NumberFormatException e) {
			System.out.println(strArray[j] + "는 정수로 변환할 수 없습니다.");
		}

	}

}
