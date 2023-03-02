package com.firstProject;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindOddEven {

	
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList( 23,20,25,5, 8, 9, 11, 10,14,15);
		
		List<Integer> even = list.stream().filter(i-> i%2 == 0).collect(Collectors.toList());
		System.out.println("Even Numbers are : "+even);
		
		List<Integer> odd = list.stream().filter(i-> i%2 != 0 ).collect(Collectors.toList());
		System.out.println("Odd Numbers are : "+odd);
		
	}
}
