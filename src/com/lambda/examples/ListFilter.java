package com.lambda.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListFilter {

	public static void main(String[] args) {
		
		List<String> strList = Arrays.asList("abc", "bcd", "defg", "jk");
		
		List<String> filteredList = strList.stream().filter(x -> x.length() > 2).collect(Collectors.toList());
		
		System.out.printf("Original List : %s, Filtered List : %s %n", strList, filteredList);
		
	}

}
