package Arrays;
import java.util.*;

public class ArrayInputFromUser {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int []arr = new int[n];
		
		//array before insertion
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		} 
		
		//insert values in array
		for(int i = 0; i < n; i++) {
			int val = scn.nextInt();
			arr[i] = val;
		}
		
		//array after insertion
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
