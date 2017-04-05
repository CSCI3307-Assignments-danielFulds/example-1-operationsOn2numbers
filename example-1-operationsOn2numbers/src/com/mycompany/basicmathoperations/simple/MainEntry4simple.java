/**
 * 
 */
package com.mycompany.basicmathoperations.simple;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Dan Fulds
 *
 */
public class MainEntry4simple {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("BEF main of MainEntry4simple with args:" + args);
		System.out.println("still main of MainEntry4simple with args:" + Arrays.toString(args));
		
		// get inputs
		Scanner scanner = new Scanner(System.in);
		int number1, number2;
		float result1;
		float result2;
		float result3;
		float result4;
		// read number 1 and number 2 inputs
		System.out.println("Enter number 1");
		number1 = scanner.nextInt();
		System.out.println("Enter number 2");
		number2 = scanner.nextInt();
		
		// Add block
		Add adder = new Add();
		result1 = adder.add(number1, number2);
				
		// Subtract block
		Subtract subtracter = new Subtract();
		result2 = subtracter.subtract(number1, number2);
		
		// Multiply block
		Multiply multiplier = new Multiply();
		result3 = multiplier.multiply(number1, number2);
		
		// Divide block
		Divide divider = new Divide();
		result4 = divider.divide(number1, number2);
				
		// print out result - NOTE %d is for int, %f is for float(and double), %.2f means 2 digits after decimal like 123.45
		System.out.printf("result 1 is %.2f%n", result1);
		System.out.printf("result 2 is %.2f%n", result2);
		System.out.printf("result 3 is %.2f%n", result3);
		System.out.printf("result 4 is %.2f%n", result4);
		scanner.close();
	}

}
