package Patterns;
import java.util.Scanner;
//input: 5
//output:
//	*****
//	****
//	***
//	**
//	*

public class Pattern3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = n;
		//rows
		int rows = 1;
		while(rows <= n) {
			//work
			int col =1;
			while(col<=nst) {
				System.out.print('*');
				col++;
			}
			//prep
			System.out.println();
			nst = nst - 1;
			rows = rows + 1;
		}
	}

}
