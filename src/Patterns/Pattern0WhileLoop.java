package Patterns;
import java.util.Scanner;

//sample input : 5
//sample output: 
//*
//*
//*
//*
//*

public class Pattern0WhileLoop {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		//rows
		int row =1;
		while(row<=n) {
			//work
			System.out.print("*");
			\
			//prep for next step
			System.out.println();
			row++;
		}
	}

}
