package com.secondPackage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortUsingStream {

	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(23, 45, 65, 10, 8, 13, 6, 50);
		
		
		List<Integer> sorted = list.stream().sorted( (x,y)-> x.compareTo(y)).collect(Collectors.toList());
		System.out.println("Ascending Sorting list is :  " +sorted);

		
	}
}
