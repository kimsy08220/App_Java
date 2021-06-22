
public class MultiCondition {

	public static void main(String[] args) {
		
		double var1 = 36.0;		// 체온	
		boolean var2 = false;	// 기침
		boolean var3 = false; 	// 인후통
		
		// 자가진단 프로그램
		if (var1 > 37.5)
			System.out.println("체온이 37.5보다 높습니다. -> 선별진료소");
		else if (var2)
			System.out.println("기침이 있습니다. -> 선별진료소");
		else if (var3)
			System.out.println("인후통이 있습니다. -> 선별진료소");
		else
			System.out.println("정상 등교");
	}

}
