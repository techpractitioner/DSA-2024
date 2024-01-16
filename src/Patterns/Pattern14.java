package Patterns;
import java.util.Scanner;
//input: 10
//output:

//  1 
//  2 * 2
//  3 * 3 * 3
//  4 * 4 * 4 * 4
//  5 * 5 * 5 * 5 * 5
//  4 * 4 * 4 * 4
//  3 * 3 * 3 
//  2 * 2
//  1
 
public class Pattern14 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nr = 2*n - 1;
		int nst = 1;
		int val;
		
		//row 
		int row =1;
		while(row <= nr) {
			
			if(row <= nr/2 +1)
				val = row;
			else
			    val = nr - row + 1;
			
			//work
			int cst =1;
			while (cst <= nst) {
				if(cst % 2 == 0) {
					System.out.print("*");
				}else {
					System.out.print(val);
				}
				cst ++;
			}
			
			//prep
			System.out.println();
			
			if(row <= nr/2) {
				nst += 2;
			}else {
				nst -= 2;
			}
			row = row +1;
		}
	}

}
