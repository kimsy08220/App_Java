
public class VariablesInitTest00 {

	static int cv = 1;
	int iv = 1;
	
	static {
		System.out.println("Ŭ���� ���� �ʱ�ȭ ��� �ʱ�ȭ �� : " + VariablesInitTest00.cv);
		cv = 2;
		System.out.println("Ŭ���� ���� �ʱ�ȭ ��� �ʱ�ȭ �� : " + VariablesInitTest00.cv);
	}
	{
		System.out.println("�ν��Ͻ� ���� �ʱ�ȭ ��� �ʱ�ȭ �� : " + this.iv);
		iv = 2;
		System.out.println("�ν��Ͻ� ���� �ʱ�ȭ ��� �ʱ�ȭ �� : " + this.iv);
	}
	
	VariablesInitTest00() {
		System.out.println("������ �ʱ�ȭ �� : " + this.iv);
		iv = 3;
		System.out.println("������ �ʱ�ȭ �� : " + this.iv);
	}
	
	@Override
	public String toString() {
		return String.format("VariablesInitTest00 [iv= %s, cv=%s]", iv, VariablesInitTest00.cv);
	}
	
	public static void main(String[] args) {
		
		System.out.println("������ �ʱ�ȭ ��ġ�� ���� �ʱ�ȭ ���� �˾ƺ���");
		VariablesInitTest00 v1 = new VariablesInitTest00();
		System.out.println(v1);

	}

}
