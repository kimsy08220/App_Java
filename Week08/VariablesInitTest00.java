
public class VariablesInitTest00 {

	static int cv = 1;
	int iv = 1;
	
	static {
		System.out.println("클래스 변수 초기화 블록 초기화 전 : " + VariablesInitTest00.cv);
		cv = 2;
		System.out.println("클래스 변수 초기화 블록 초기화 후 : " + VariablesInitTest00.cv);
	}
	{
		System.out.println("인스턴스 변수 초기화 블록 초기화 전 : " + this.iv);
		iv = 2;
		System.out.println("인스턴스 변수 초기화 블록 초기화 후 : " + this.iv);
	}
	
	VariablesInitTest00() {
		System.out.println("생성자 초기화 전 : " + this.iv);
		iv = 3;
		System.out.println("생성자 초기화 후 : " + this.iv);
	}
	
	@Override
	public String toString() {
		return String.format("VariablesInitTest00 [iv= %s, cv=%s]", iv, VariablesInitTest00.cv);
	}
	
	public static void main(String[] args) {
		
		System.out.println("변수의 초기화 위치에 따른 초기화 순서 알아보기");
		VariablesInitTest00 v1 = new VariablesInitTest00();
		System.out.println(v1);

	}

}
