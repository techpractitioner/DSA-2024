package Patterns;
import java.util.Scanner;
//input: 3
//output:

//          1
//        1 2 1
//      1 2 3 2 1
 
public class Pattern13 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = 1;
		int nsp = n-1;
		int val = 1;
		
		//row 
		int row = 1;
		while(row <= n) {
			
			//spaces work
			for(int csp = 1; csp <= nsp; csp++) {
				System.out.print("\t");
			}
			
			//star work
			for(int cst = 1; cst <= nst; cst++) {
				System.out.print(val + "\t");
				if(cst <= nst/2) {
					val++;
				}else {
					val--;
				}
			}
			
			//prep
			System.out.println();

			val = 1;
			nsp = nsp - 1;
			nst = nst + 2;
			row = row + 1;
		}
	}

}
