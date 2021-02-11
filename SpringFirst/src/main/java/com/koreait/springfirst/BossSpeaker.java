package com.koreait.springfirst;

public class BossSpeaker implements Speakerable{
	
	private int currentSpeakerPower;
	
	public BossSpeaker() {
		System.out.println("-- BossSpeaker Created --");
	}
	
	@Override
	public void speakUp() {
		currentSpeakerPower++;
	}

	@Override
	public void speakDown() {
		currentSpeakerPower--;
	}
}
