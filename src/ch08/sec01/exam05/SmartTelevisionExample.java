package ch08.sec01.exam05;

import ch08.sec01.exam02.RemoteControl;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv;
		Searchable searchable = tv;
		
	}

}
