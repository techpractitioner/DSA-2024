package Level1;
import java.util.Scanner;

public class HCF_GCD {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int dividend = scn.nextInt();
		int divisor = scn.nextInt();
		while(dividend % divisor != 0) {
			int rem = dividend % divisor;
			dividend = divisor;
			divisor = rem;
		}
		System.out.print(divisor);
	}

}
