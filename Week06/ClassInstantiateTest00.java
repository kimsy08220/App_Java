
class CatClass {
	// �ʵ�
	String name;
	String color;
	
	// �޼ҵ�
	void meow() {
		System.out.println(color + "���� " + name + "�� ���.");
	}
	void run() {
		System.out.println(color + "���� " + name + "�� �ڴ�.");
	}
	void walking() {
		System.out.println(color + "���� " + name + "�� �ȴ´�.");
	}
}

public class ClassInstantiateTest00 {

	public static void main(String[] args) {
		
		CatClass cat1 = new CatClass();
		cat1.name = "����";
		cat1.color = "Black";
		cat1.meow();
		cat1.run();
		cat1.walking();
		
		CatClass cat2 = new CatClass();
		cat2.name = "�׷�";
		cat2.color = "White";
		cat2.meow();
		cat2.run();
		cat2.walking();
		
	}

}
