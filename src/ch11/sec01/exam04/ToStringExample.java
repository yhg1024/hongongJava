package ch11.sec01.exam04;

import java.util.Date;

public class ToStringExample {
	
	public static void main(String[] args) {
		Object obj1 = new Object();
		Date obj2 = new Date();
		
		// 각 참조변수를 toString()로 호출
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		
		
	}

}
