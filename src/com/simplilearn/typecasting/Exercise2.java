package com.simplilearn.typecasting;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// WAP from Data converting from double & long -> int, short, byte & float
		Scanner input = new Scanner(System.in);
		System.out.println(" Numeric convertor:");
		System.out.println("Enter an Double Numeric value: ");
		double userInput = input.nextDouble();
		
		Scanner input2= new Scanner(System.in);
		System.out.println(" Numeric convertor:");
		System.out.println("Enter a long Numeric value: ");
		long userInput2 = input.nextLong();
		
		int Integerinput1 = (int) userInput;
		short Shortinput1 = (short) userInput;
		byte Byteinput1 = (byte) userInput;
		float Floatinput1 = (float) userInput;
		
		int Integerinput2 = (int) userInput2;
		short Shortinput2 = (short) userInput2;
		byte Byteinput2 = (byte) userInput2;
		float Floatinput2 =  userInput2;
		
		System.out.println("Double -> Int " +Integerinput1);
		System.out.println("Double -> Short " +Shortinput1);
		System.out.println("Double -> Byte " +Byteinput1);
		System.out.println("Double -> Float " +Floatinput1);
		
		System.out.println("Long -> Int " +Integerinput2);
		System.out.println("Long -> Short " +Shortinput2);
		System.out.println("Long -> Byte " +Byteinput2);
		System.out.println("Long -> Float " +Floatinput2);


		
		
		
		

		

	}

}
