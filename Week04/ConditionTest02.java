import java.util.*;

public class ConditionTest02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int user, computer = 0;
		
		computer = (int)(Math.random() * 100) + 1;
		System.out.println("컴퓨터의 생성값 = " + computer);
		
		do {
			System.out.print("1~100까지의 정수를 입력하세요> ");
			user = scanner.nextInt();
			
			if (user < computer)
				System.out.println("더 큰 값을 입력하세요.");
			else if (user > computer)
				System.out.println("더 작은 값을 입력하세요.");
		} while (computer != user);
		
		System.out.println("정답입니다!");
		scanner.close();
	}

}
