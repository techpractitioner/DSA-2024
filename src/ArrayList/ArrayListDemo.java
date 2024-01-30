package ArrayList;
import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();
		System.out.println(list);                  //use the name of the ArrayList in order to get the whole ArrayList
		System.out.println(list.size());           //use <list_name>.size() to get the size of the list
		list.add(10);                              //add <list_name>.add(<element>) to add an element at the last index
		list.add(20);     
		list.add(30);     
		list.add(40);     
		list.add(50);   
		System.out.println(list);
		System.out.println(list.size());
		list.add(2,90);                           //use <list_name>(<index>,<element>) to insert an element at a particular index
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(5));          //use <list_name>.get(<index>) to get the element from an index
		System.out.println(list.get(list.size()-1));  //use <list_name>.get(<list_name>.size()-1)) get the element from last index
		list.set(4, 95);                          //use <list_name>.set(<index>,<element>)to update the value at a particular index
		System.out.println(list);
		list.set(list.size()-1, 20);              //to update the value at last index
		System.out.println(list);
		list.remove(0);                           //to remove the element from a particular index
		System.out.println(list);  
		
		for(int i =0; i < list.size(); i++) {
			System.out.print(list.get(i)+ " ");
		}
		
		System.out.println();
		
		for(int i: list) {
			System.out.print(i + " ");
		}
	}

}
