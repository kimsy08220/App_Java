package oop.modifier;

public class Card {
		
	public String kind = "spade";			// default ����
	private int number = 1;
	protected String color = "black";
	public static int width = 200;			// default ����
	public static int height = 300;			// default ����
		
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}

}
