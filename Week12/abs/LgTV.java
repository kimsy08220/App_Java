package oop.abs;

public class LgTV extends TV {
	public LgTV() {
		this.displayType = "QLED";
	}
	@Override
	void display() {
		System.out.println("LgTV�� " + this.displayType + "�� ����Ͽ� ����մϴ�.");
	}
}
