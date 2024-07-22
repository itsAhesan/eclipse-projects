package com.jony.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo {

	public static void main(String[] args) {
		Set set= new HashSet();
		set.add(101);
		set.add(108);
		set.add("A");
		set.add(104);
		System.out.println(set.size());
		
		System.out.println(set);	//No Order
		
		Set ls= new LinkedHashSet();
		ls.add(10);
		ls.add(9);
		ls.add("B");
		ls.add(10);
		System.out.println(ls);		//Preserve Insertion Order
		
		Set tree= new TreeSet();	//NOTE: Elements must be same type
		tree.add(50);
		tree.add(9);
		tree.add(100);
		
		System.out.println(tree); 	//ASC or DSC
		
		
		
		
	}

}
