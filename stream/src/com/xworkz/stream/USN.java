package com.xworkz.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class USN {

	public static void main(String[] args) {
		Collection<String> usn = new ArrayList<String>();
		usn.add("2KL17EC200");
		usn.add("2KL17CS201");
		usn.add("2KL17EC202");
		usn.add("2KL17CS203");
		usn.add("2KL17BM204");
		usn.add("2KL17EC205");

		Collection<String> temp = usn.stream().filter((sun) -> sun.contains("CS")).collect(Collectors.toList());
		temp.forEach((s) -> System.out.println(s));
		System.out.println(temp.size());
	}
		
}
