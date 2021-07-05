package oop.abs;

public class AbstractTest00 {
	
	public static void main(String[] args) {
		MyHouse house1 = new MyHouse(new SamsungTV());
		house1.showTV();
		MyHouse house2 = new MyHouse(new LgTV());
		house2.showTV();
	}
	
}
