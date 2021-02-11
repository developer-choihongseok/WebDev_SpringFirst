package com.koreait.springfirst;

import org.springframework.stereotype.Component;

// @Component에 의해 bean 등록.
// application.xml에서 15번째 줄을 대신한다.
@Component("tv")
public class LgTV extends Tv{
	
	public LgTV() {
		super(10, 20);
		System.out.println("--- LgTV created default 생성자 ---");
	}
	
	public LgTV(int maxChannel, int maxVolume) {
		super(maxChannel, maxVolume);
		System.out.println("maxChannel: " + maxChannel);
		System.out.println("maxVolume: " + maxVolume);
		System.out.println("--- LgTV created override 생성자 ---");
	}
	
	@Override
	public String toString() {
		return "LgTV: " + super.toString();
	}
}
