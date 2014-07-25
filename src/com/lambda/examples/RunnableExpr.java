package com.lambda.examples;

public class RunnableExpr {

	public static void main(String[] args) {
		Runnable runnable = () -> System.out.println("Hello Runnable");
		runnable.run();
	}

}
