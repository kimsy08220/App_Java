
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
				System.out.println("strArray�� " + j + "��°�� ���ڷ� ��ȯ�� ���� " + m + "�Դϴ�.");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� �ε����� ������ϴ�.");
		} catch (NumberFormatException e) {
			System.out.println(strArray[j] + "�� ������ ��ȯ�� �� �����ϴ�.");
		}

	}

}
