package Arrays;


// Arrays store homogeneous values or elements of the same type in continuous memory locations.
// The new keyword allows us to allocate a memory location in the heap memory.
// All indexes in the integer array contain the default value of 0 in Java


public class ArrayDemo {

	public static void main(String[] args) {
		
		//declare
		int[] arr = null;
		System.out.println(arr);
		
		//allocate space 
		arr = new int[5];
		System.out.println(arr);  //sample output: [I@58d25a40, here '[' this represents that this is an array and 'I' represents that this is an integer array rest is the memory location
		
		//get
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		//set
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		//get
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		//print
		for(int i= 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
