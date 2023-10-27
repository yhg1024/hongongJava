package exrta.Quiz;

public class SubStringExample {
	public static void main(String[] args) {
		String msg = "I love JaVA";
		String findString = "love";
		int subStartPos = msg.indexOf(findString); // 2
		int subEndPos = subStartPos + "love".length();
		System.out.println(msg.substring(subStartPos, subEndPos));
	}
}