
public class MultiCondition {

	public static void main(String[] args) {
		
		double var1 = 36.0;		// ü��	
		boolean var2 = false;	// ��ħ
		boolean var3 = false; 	// ������
		
		// �ڰ����� ���α׷�
		if (var1 > 37.5)
			System.out.println("ü���� 37.5���� �����ϴ�. -> ���������");
		else if (var2)
			System.out.println("��ħ�� �ֽ��ϴ�. -> ���������");
		else if (var3)
			System.out.println("�������� �ֽ��ϴ�. -> ���������");
		else
			System.out.println("���� �");
	}

}
