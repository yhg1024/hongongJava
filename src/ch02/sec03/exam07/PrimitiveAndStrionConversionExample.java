package ch02.sec03.exam07;

public class PrimitiveAndStrionConversionExample {
	public static void main(String[] args) {
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		//pintformat
		System.out.printf("value1 : %s \n", value1); // %s : 뒤쪽에 있는 변수값을 %s 자리에 출력
		System.out.printf("value2 : %s \n", value2);
		System.out.printf("value3 : %s \n", value3);
		
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);
		
		//////////////////////////////////////////
		// pg.88 9번 문제
		long var1 = 2L;
		float var2 = 1.9f;
		double var3 = 2.5;
		String var4 = "3.9";
		
		int result = (int)(var1 + 
				var2 + 
				var3 + 
				Double.parseDouble(var4));
		System.out.println(result);
	}

}
