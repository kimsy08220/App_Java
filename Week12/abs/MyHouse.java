package oop.abs;

public class MyHouse {
	TV tv;		// ��ü ���� �Ұ�
	
	public MyHouse(TV tv) {
		this.tv = tv;
	}
	public void showTV() {
		tv.display();
	}
}
