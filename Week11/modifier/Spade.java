package oop.modifier;

public class Spade {

	public static void main(String[] args) {
		
		Card c = new Card();
		c.kind = "diamond";
		
		System.out.println(c.kind);
		System.out.println(c.getNumber());
		System.out.println(c.color);
		System.out.println(c.width);
		System.out.println(c.height);
	}

}
