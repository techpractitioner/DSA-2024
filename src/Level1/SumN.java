package Level1;
import java.util.Scanner;

public class SumN {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int counter=1, sum = 0;
		while(counter <= n) {
			sum = sum + counter;
			counter++;
		}
		System.out.println("The sum of " + n +" natural numbers is: " + sum);
	}

}
