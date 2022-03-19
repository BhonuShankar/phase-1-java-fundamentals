package com.simplilearn.typecasting;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO :: WAP for data converting from  string number  -> int short byte long double and float.

		Scanner input = new Scanner(System.in);

		System.out.println(":: String to Numeric Convertor ::");

		System.out.println(":: Enter a number string value :: ");
		String number = input.nextLine();
		
		int intnumber = Integer.parseInt(number);
		short shortnumber = Short.parseShort(number);
		byte bytenumber = Byte.parseByte(number);
		long longnumber = Long.parseLong(number);



		float floatnumber = Float.parseFloat(number);

		double doublenumber = Double.parseDouble(number);

		
		System.out.println("Integer Number : "+intnumber);

		System.out.println("Short Number : "+shortnumber);

		System.out.println("Byte Number : "+bytenumber);
		
		System.out.println("Long Number : "+longnumber);

		System.out.println("Float Number : "+floatnumber);

		System.out.println("Double Number : "+doublenumber);
	}

}
