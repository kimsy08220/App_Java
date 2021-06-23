import java.util.*;

public class ConditionTest01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("현재 날짜를 입력해주세요. > ");
		int month = scanner.nextInt();
		
		switch(month)
		{
		case 3: case 4: case 5:
			System.out.println("지금은 봄입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println("지금은 여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println("지금은 가을입니다.");
			break;
		default :
			System.out.println("지금은 겨울입니다.");
			break;
		}
		
		scanner.close();
	}

}
