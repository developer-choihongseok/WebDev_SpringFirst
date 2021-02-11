package com.koreait.springfirst;

import org.springframework.beans.factory.annotation.Autowired;

/*
 @Qualifier("boss") : BossSpeaker 객체를 사용하겠다.
 @Inject => @Autowired + @Qualifier
 @Autowired : 자동으로 연결 + bean 등록 한 것 중에 Speakerable 타입이 가리킬 수 있는 객체를 자동으로 이어준다(=주입한다).
*/
public class Tv {
	
	@Autowired
	private Speakerable speaker;	// 현재 주소값을 넣어주지 않아서, null값이 나온다.
	
	private int maxChannel;
	private int currentChannel;
	private int maxVolume;
	private int currentVolume;
	
	public Tv(int maxChannel, int maxVolume) {
		this.maxChannel = maxChannel;
		this.maxVolume = maxVolume;
	}
	
	public void setSpeaker(Speakerable speaker) {
		this.speaker = speaker;
	}
	
	public void volumeUp() {
		if(maxVolume > currentVolume) {
			currentVolume++;
		}
		speaker.speakUp();
	}
	
	public void volumeDown() {
		if(currentVolume > 0) {
			currentVolume--;
		}
		speaker.speakDown();
	}
	
	@Override
	public String toString() {
		return String.format("currentChannel : %d, currentVolume : %d", currentChannel, currentVolume);
	}
}