package oop.abs;

public class MyHouse {
	
	TV tv;		
	
	public MyHouse(TV tv) {
		this.tv = tv;
	}
	public void showTV() {
		tv.display();
	}
	
}
