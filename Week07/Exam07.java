
class Data {
	int x;
}

public class Exam07 {

	public static void main(String[] args) {
		 
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : d.x " + d.x);

		change(d);
		System.out.println("After change() : d.x " + d.x);
	}
	static void change(Data d) {
		d.x = 10000;
		System.out.println("change() : x " + d.x);
	}

}
