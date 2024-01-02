package Patterns;
import java.util.Scanner;
//input: 5
//output:
// *****
//	****
//	 ***
//	  **
//     *

public class Pattern5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = n;
		int nsp = 0;
		//rows
		int rows = 1;
		while(rows <= n) {
			//spaces work
			int csp =1;
			while(csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			//stars work
			int cst =1;
			while(cst <= nst) {
				System.out.print('*');
				cst++;
			}
			//prep
			System.out.println();
			nsp = nsp + 1;
			nst = nst - 1;
			rows = rows + 1;
		}
	}

}
