package Patterns;
import java.util.Scanner;
//input: 3
//output:

//          1
//        2 3 4
//      5 6 7 8 9
 
public class Pattern12 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = 1;
		int nsp = n-1;
		int val = 1;
		
		//row 
		int row =1;
		while(row <= n) {
			val = row;
			
			//spaces work
			for(int csp = 1; csp <= nsp; csp++) {
				System.out.print("\t");
			}
			
			//star work
			for(int cst = 1; cst <= nst; cst++) {
				System.out.print(val + "\t");
				val++;
			}
			
			//prep
			System.out.println();

			nsp = nsp - 1;
			nst = nst + 2;
			row = row + 1;
		}
	}

}
