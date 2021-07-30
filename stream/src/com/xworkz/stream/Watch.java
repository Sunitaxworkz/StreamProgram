package com.xworkz.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Watch {

	public static void main(String[] args) {
		Collection<String> watchList = new ArrayList<String>();
		watchList.add("Sonata");
		watchList.add("Citizen");
		watchList.add("Fastrack");
		watchList.add("Casio");
		watchList.add("Fossil");
		watchList.add("Titan");
		watchList.add("Timex");

		Collection<String> temp = watchList.stream().filter((sun) -> sun.startsWith("T")).collect(Collectors.toList());
		temp.forEach((s) -> System.out.println(s));
		System.out.println(temp.size());
		// System.out.println(watchList);
		
	System.out.println("**************************************************");	
		
		Collection<String> list = Arrays.asList("S", "U", "N", "I", "T","A");
		list.stream().forEach((a) -> System.out.println(a.toUpperCase()));
		System.out.println(list.size());

	}

}
