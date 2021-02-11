package com.koreait.springfirst;

public class SamsungTV extends Tv{
	
	public SamsungTV() {
		super(10, 10);
	}
	
	public SamsungTV(int maxChannel, int maxVolume) {
		super(maxChannel, maxVolume);
	}
	
	@Override
	public String toString() {
		return "SamsungTV: " + super.toString();
	}
}
