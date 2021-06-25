class TV {
	// 속성(필드)
	boolean power;
	int channel;
	int volume;
	
	// 메소드
	void powerOn() { power = true; }
	void powerDown() { power = false; }
	void channelUp() { channel++; }
	void channelDown() { channel--; }
	void volumeUp() { volume++; }
	void volumeDown() { volume--; }
	@Override
	public String toString() {
		return String.format("TV [power= %s, channel=%s, volume=%s]", power, channel, volume);
	}
}

public class ClassInstantiateTest01 {

	public static void main(String[] args) {
		
		TV tv = new TV();
		System.out.println(tv);
		tv.power = true;
		tv.channel = 7;
		tv.volume = 5;
		System.out.println(tv);
		tv.channelUp();
		tv.volumeUp();
		System.out.println(tv);

	}

}
