import java.util.*;

public class ConditionTest02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int user, computer = 0;
		
		computer = (int)(Math.random() * 100) + 1;
		System.out.println("��ǻ���� ������ = " + computer);
		
		do {
			System.out.print("1~100������ ������ �Է��ϼ���> ");
			user = scanner.nextInt();
			
			if (user < computer)
				System.out.println("�� ū ���� �Է��ϼ���.");
			else if (user > computer)
				System.out.println("�� ���� ���� �Է��ϼ���.");
		} while (computer != user);
		
		System.out.println("�����Դϴ�!");
		scanner.close();
	}

}
