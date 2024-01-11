package Patterns;
import java.util.Scanner;
//input: 5
//output:
//*       *
//**     **
//***   ***
//**** ****
//*********

public class Pattern9 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = 1;
		int nsp = 2*n-3;
		
		//row 
		int row =1;
		while(row <= n) {
			
			//star work
			for(int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}
			
			//spaces work
			for(int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}
			
			//star work
			int cst = 1;
			if(row == n) {
				cst = 2;
			}
			
			for(; cst <= nst; cst++) {
				System.out.print("*");
			}
			
			//prep
			System.out.println();

			nsp = nsp - 2;
			nst = nst + 1;
			row = row + 1;
		}
	}

}
