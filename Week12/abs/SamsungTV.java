package oop.abs;

public class SamsungTV extends TV {
	public SamsungTV() {
		this.displayType = "QLED";
	}
	@Override
	void display() {
		System.out.println("SamsungTV�� " + this.displayType + "�� ����Ͽ� ����մϴ�.");
	}
}
