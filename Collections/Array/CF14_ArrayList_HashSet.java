package com.evergent.coreJAVA.Collections.Array;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
public class CF14_ArrayList_HashSet {
	public static void main(String[] args) {
	List<String> list= new ArrayList<String>();
	list.add("CORE JAVA");
	list.add("J2EE");
	list.add("J2SE");
	list.add("MY JAVA");
	System.out.println(list);
	Set<String> s = new HashSet<String>();
	s.addAll(list);
	System.out.println(s);
	Set<String> s1 = new HashSet<String>();
	s1.add("CORE JAVA");
	s1.add("J2EE");
	s1.add("J2SE");
	s1.add("MY JAVA");
	System.out.println(s1);
	if(s.equals(s1))
		System.out.println("Same");
	else
		System.out.println("Not same");
	System.out.println(s.containsAll(s1));
	if(s.equals(list))
		System.out.println("Same");
	else
		System.out.println("Not same");
	}
}