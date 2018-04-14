
public class Fibonacci {
	public static void main(String[] args) {

		int first = 0;
		int second = 1;
		System.out.println(first);
		System.out.println(second);
		for (int i = 0; i < 45; i++) {
			int temp = first + second;
			first = second;
			second = temp;
			System.out.println(temp);

		}

	}
}
