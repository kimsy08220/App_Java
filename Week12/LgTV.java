package oop.abs;

public class LgTV extends TV {
	public LgTV() {
		this.displayType = "QLED";
	}
	@Override
	void display() {
		System.out.println("LgTV는 " + this.displayType + "를 사용하여 재생합니다.");
	}
}
