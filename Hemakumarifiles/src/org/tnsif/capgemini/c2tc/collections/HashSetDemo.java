package org.tnsif.capgemini.c2tc.collections;
//Hash Set is an unordered Collection of elements
import java.util.HashSet;
import java.util.Set;
public class HashSetDemo 
{
	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		set.add("apple");
		set.add("banana");
		set.add("cherry");
		set.add("apple");//It can store only unique elements
		System.out.println("Hashset :"+ set);
	}
}
