package Patterns;
import java.util.Scanner;
//input: 5
//output:
//  *
//  **
//  ***
//  ****
//  *****
//  ****
//  ***
//  **
//  *

public class Pattern6 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nr = 2*n - 1;
		int nst = 1;
		//rows
		int rows = 1;
		while(rows <= nr) {
			//work
			int cst = 1;
			while(cst <= nst) {
				System.out.print('*');
				cst = cst + 1;
			}
			//prep
			System.out.println();
			if(rows <= nr/2) {
				nst = nst + 1;
			}else {
				nst = nst - 1;
			}
			rows = rows + 1;
		}
	}

}
