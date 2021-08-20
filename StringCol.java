package assessment;

import java.util.*;

public class StringCol {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<String> ar=new ArrayList<>();
		System.out.println("Enter the number of strings to be added in the list");
		int len=sc.nextInt();
		
		for(int i=0;i<len;i++) {
			System.out.println("Enter The String"+i);
			ar.add(sc.next());
		}
		System.out.println("The new List of reversed Strings are:");
		
		for(int i=ar.size()-1;i>=0;i--) {
			
			System.out.println("String :" +ar.get(i));
			
			
		}
	}

}
