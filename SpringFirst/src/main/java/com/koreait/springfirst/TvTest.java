package com.koreait.springfirst;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TvTest {
	public static void main(String[] args) {
		// ApplicationContext를 이용해서, 만들어 놓은 application.xml을 읽어 온다. => 스프링 컨테이너 구동!!
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
		
		// 객체화
		// beans에 등록된 클래스의 기본 생성자가 자동으로 호출된다.
		// 다형성의 힘: 소스의 수정 없이, xml파일만 수정을 해서 speaker를 바꿀 수 있다.
		Speakerable bs = (Speakerable) ctx.getBean("refSpeaker");
		System.out.println("bs: " + bs);
		
		Tv tv = (Tv) ctx.getBean("tv");
//		tv.setSpeaker(bs);
		tv.volumeUp();
		
		System.out.println("tv: " + tv);
	}
}
