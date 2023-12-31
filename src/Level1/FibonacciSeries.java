package Level1;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a = 0, b = 1, counter = 1;
		while(counter <= n+1) {
			System.out.print(a + " ");
			int sum = a+b;
			a = b;
			b = sum;
			counter++;
		}
	}

}
