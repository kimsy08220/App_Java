package oop.abs;

public class SamsungTV extends TV {
	public SamsungTV() {
		this.displayType = "QLED";
	}
	@Override
	void display() {
		System.out.println("SamsungTV는 " + this.displayType + "를 사용하여 재생합니다.");
	}
}
