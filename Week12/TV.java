package oop.abs;

public abstract class TV {
	
	int channel;
	int volume;
	String displayType;
	TV() {}
	
	void volumeUp() { volume++; }
	void volumeDown() { volume--; }
	void channelUp() { channel++; }
	void channelDown() { channel--; }
	
	abstract void display();
	
}
