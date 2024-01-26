package Arrays;
import java.util.*;

//Input:
//N = 5, S = 12
//A[] = {1,2,3,7,5}
//Output: 2 4
//Explanation: The sum of elements 
//from 2nd position to 4th position 
//is 12.

public class SubarrayWithGivenSum {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sum = scn.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int start = 0, end = 0, currentSum = 0;
		for(int i = 0; i < n; i++) {
			while(start <= end && sum < currentSum) {
				if()
			}
		}
	}

}
