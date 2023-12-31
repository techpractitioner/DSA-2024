package Level1;
import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int counter =2;
		boolean flag =true;
		while(counter <= n-1) {
			if(n%counter == 0) {
				flag = false;
			}
			counter++;
		}
		if(flag) {
			System.out.println(n + " is a PRIME number.");
		}else {
			System.out.println(n + " is a NON-PRIME number");
		}
	}

}
