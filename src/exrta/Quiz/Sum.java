package exrta.Quiz;

public class Sum {
	public static void main(String[] args) {
		int sum = 0;
		int i;
		int j;
		int k;
		for(k = 1; k < 10; k++) {
			sum += k;
			System.out.print(k);
			System.out.print(" + ");
		}
		sum = sum +k;
		System.out.print(k);
		System.out.print(" -> ");
		System.out.println(sum);
		for (i = 1; i < 10; i++) {
			for (j = 1; j < 10; j++) {
				sum = i*10 +j + sum;
				
				System.out.print(i);
				System.out.print(j);
				System.out.print(" + ");
			}
			int n = (i+1)*10;
			sum = sum +n;
			System.out.print(n);
			System.out.print(" -> ");
			System.out.println(sum);
		}
	}
}
