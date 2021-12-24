package stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Group {

	public static void main(String[] args) {
		List<fruit> fruits = Arrays.asList(
			new fruit("apple",90,25,"red"),
			new fruit("orange",80,15,"orange"),
			new fruit("banana",95,5,"yellow"),
			new fruit("grapes",50,20,"green")
			    );
		//Collections.sort(fruits,(o1,o2) ->(o2.getCalories()-o1.getCalories()));
		Collections.sort(fruits,(o1,o2)->(o1.getPrice()-o2.getPrice()));
			
	

	}

}
