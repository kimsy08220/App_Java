
public class exam02 {

	public static void main(String[] args) {
		
		int GuGuDan[][] = new int[8][9];	// [단수 인덱스][곱해지는 수 인덱스]

		for (int i = 2; i < 10; i++) {	
			for (int j = 1; j < 10; j++)
				GuGuDan[i-2][j-1] = i * j;
		}
		
		for (int i = 2; i < 10; i++) {	
			System.out.println("----" + i + "단----");
			for (int j = 1; j < 10; j++)
				System.out.println(i + " X " + j + " = " + GuGuDan[i-2][j-1]); 
		}
	}
}
