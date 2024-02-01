package ArrayList;
import java.util.*;
//Input:
//	one: [10,10,20,30,30,30,50,70,75]
//	two: [30, 30, 50, 60, 60, 70, 70, 70, 80, 90, 100]
//Output: [30, 30, 50, 70]

public class TwoArrayIntersection {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		//take input of two arrays
		int n1 = scn.nextInt();
		int array1[] = new int[n1];
		for(int i = 0; i<n1; i++) {
			array1[i] = scn.nextInt();
		}
		
		int n2 = scn.nextInt();
		int array2[] = new int[n2];
		for(int i = 0; i<n2; i++) {
			array2[i] = scn.nextInt();
		}
		
		//result
		System.out.println(intersection(array1, array2));
		
	}
	
	//Intersection Calculation
			public static ArrayList<Integer> intersection(int[] one, int[] two){
				ArrayList<Integer> ans = new ArrayList<>();
				int i1 = 0, i2 = 0;
				while(i1 < one.length && i2 < two.length) {
					if(one[i1] == two[i2]) {
						ans.add(one[i1]);
						i1++;
						i2++;
					}else if(one[i1] < two[i2]) {
						i1++;
					}else {
						i2++;
					}
				}
				return ans;
			}

}
