package Patterns;
import java.util.Scanner;

//sample input : 5
//sample output: 
//*
//*
//*
//*
//*

public class Pattern0 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for(int row = 1; row<=n; row ++) {
			//work
			System.out.print("*");
			//prep for next step
			System.out.print("\n");
		}
	}

}
