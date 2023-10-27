package ch07.sec02.exam05;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		// parent.method3();
		
		Child child = (Child)parent;
		child.field1 = "new data1";
		child.method1();
		child.method2();
		child.method3();
	}

}
