package Eception;

import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class Unspported {

	

	public static void main(String[] args) {
		String str[] = {"Apple","Banana"};
		List<String> list = Arrays.asList(str);
		List<String> l = new ArrayList<>(list);
		
		l.add("Mango");
		
		for(String s:l)
			System.out.println(s);
	}	

	

}
