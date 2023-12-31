package Level1;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int reverse = 0;
		int nCopy = n;
		while(nCopy!=0) {
			int rem = nCopy%10;
			reverse = reverse*10 + rem;
			nCopy  = nCopy/10;
		}
		System.out.print(reverse);
	}

}
