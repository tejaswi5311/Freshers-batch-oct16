package generic;

import java.util.HashSet;



public class HashSetDemo {

	public static void main(String[] args) {
	HashSet<Employee> set=new HashSet<Employee>();
	set.add(new Employee("Tejaswi",101,"HR",20000)); 
	set.add(new Employee("Yesaswi",102,"IT",40000)); 
	set.add(new Employee("Jyothi",103,"Accounts",50000)); 
	set.add(new Employee("Nagesh",104,"Programmer",70000)); 
	set.add(new Employee("Anusha",105,"Analyst",60000)); 
    for(Employee i:set) {
    	System.out.println(i);
    }
    	
	   
	   
	}
	
}
