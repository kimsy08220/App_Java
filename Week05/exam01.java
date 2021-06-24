
public class exam01 {

	public static void main(String[] args) {
		
		System.out.println("while() ----------");
		int k = 0;
		while (k < 5) {
			System.out.println("*****");
			k++;
		}

		
		System.out.println("for() ----------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++)
				System.out.print("*");
			System.out.println();
		}
		
		System.out.println("for() º° ----------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
		
		System.out.println("for() ¼ýÀÚ ----------");
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0)
				continue;
			System.out.println(i);
		}
		
		System.out.println("for() µ¡¼À ----------");
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (sum > 20)
				break;
			sum += i;
		}
		System.out.println(sum);
	}

}
