package Patterns;
import java.util.Scanner;

//sample input : 5
//sample output: 
//*****
//*****
//*****
//*****
//*****

public class Pattern1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		//rows
		int row =1;
		while(row<=n) {
			//work
			int col=1;
			while(col<=n) {
			System.out.print("*");
			col++;
			}
			//prep for next step
			System.out.print("\n");
			row=row+1;
		}
	}

}
