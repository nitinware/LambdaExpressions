package com.lambda.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsSort {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("nitin", "pratik", "subin", "yuvraj");
		
		Collections.sort(names, (a,b) -> b.compareTo(a));
		
		names.forEach(n -> System.out.println(n));
	}

}
