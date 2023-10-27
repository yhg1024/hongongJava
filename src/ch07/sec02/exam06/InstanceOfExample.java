package ch07.sec02.exam06;

public class InstanceOfExample {
	
	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB);
	}

	private static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - Child로 변환 성공");
		
	}

	private static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 = Child로 변환성공");
		} else {
			System.out.println("method1 = Child로 변환되지 않음");
		}
		
	}
}
