package com.koreait.springfirst;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TvTest2 {
	public static void main(String[] args) {
		// ApplicationContext를 이용해서, 만들어 놓은 application2.xml을 읽어 온다. => 스프링 컨테이너 구동!!
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application2.xml");
		
		Tv tv = (Tv)ctx.getBean("tv");

		tv.volumeUp();
		System.out.println("tv: " + tv);
	}
}
