package com.koreait.springfirst;

public class HamanSpeaker implements Speakerable{
	
	private int currentSpeakerPower;
	
	public HamanSpeaker() {
		System.out.println("-- HamanSpeaker Created --");
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
