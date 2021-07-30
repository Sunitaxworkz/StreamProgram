package com.xworkz.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class Pan {

	public static void main(String[] args) {
		Collection<String> pan = new ArrayList<String>();
		pan.add("ABCD1234");
		pan.add("DCBA4321");
		pan.add("ASHK9804");
		pan.add("SRKD4567");
		pan.add("AQWE0980");
		pan.add("KLMO9844");

		Collection<String> temp = pan.stream().filter((sun) -> sun.startsWith("A")).collect(Collectors.toList());
		temp.forEach((s) -> System.out.println(s));
		System.out.println(temp.size());
		// System.out.println(watchList);
	}
}
