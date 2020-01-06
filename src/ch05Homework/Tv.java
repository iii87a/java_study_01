package ch05Homework;

public class Tv {

	private boolean isPowerOn;
	private int channel;
	private int volume; 
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void turnOnOff() {
	//(1)isPowerOn 의 값이 true 면 false 로, false 면 true 
		
		if (isPowerOn == true) {
			isPowerOn = false;
		}
		else {
			isPowerOn = true;
		}
	}
	
	void volumeUp() {
	//(2) 볼륨의 값이 최대 볼륨값보다 작을 때만 1을 증가시킴
		if(volume < MAX_VOLUME ) {
			volume++;
		}
	}
	
	void volumeDown() {
	//(3)볼륨 값이 최소 볼륨값보다 클 때만 값을 1 감소시킴
		if(volume > MIN_VOLUME) {
			volume--;
		}
	}
	
	void channelUp() {
	//(4) 채널의 값을 1 증가시킴
	// 만약 채널이 최대 채널 값이면, 채널의 값을 최소 채널로 바꾼다. 
		
		if(channel == MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		}
		channel++;
	}
	
	void channelDown() {
	//(5)채널의 값을 1 감소시킴
	//만약 채널이 최소 채널 값이면, 채널의 값을 최대 채널 값으로 바꾼다. 
		
		if(channel == MIN_CHANNEL) {
			channel = MAX_CHANNEL;
		}
		channel--;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	//getters & setters 
	
	


}
