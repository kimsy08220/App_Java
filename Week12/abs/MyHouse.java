package oop.abs;

public class MyHouse {
	TV tv;		// 객체 생성 불가
	
	public MyHouse(TV tv) {
		this.tv = tv;
	}
	public void showTV() {
		tv.display();
	}
}
