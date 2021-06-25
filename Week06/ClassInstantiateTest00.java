
class CatClass {
	// 필드
	String name;
	String color;
	
	// 메소드
	void meow() {
		System.out.println(color + "색인 " + name + "가 운다.");
	}
	void run() {
		System.out.println(color + "색인 " + name + "가 뛴다.");
	}
	void walking() {
		System.out.println(color + "색인 " + name + "가 걷는다.");
	}
}

public class ClassInstantiateTest00 {

	public static void main(String[] args) {
		
		CatClass cat1 = new CatClass();
		cat1.name = "나비";
		cat1.color = "Black";
		cat1.meow();
		cat1.run();
		cat1.walking();
		
		CatClass cat2 = new CatClass();
		cat2.name = "네로";
		cat2.color = "White";
		cat2.meow();
		cat2.run();
		cat2.walking();
		
	}

}
