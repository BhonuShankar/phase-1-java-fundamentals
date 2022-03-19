package com.simplilearn.typecasting;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO WAP for data converting from int, byte, short-> float, doube, long
		int intData = 32768;
		float floatIntData = intData;
		double doubleIntData = intData;
		long longIntData = intData;
		
		byte byteData = 100;
		float floatByteData = byteData;
		double doubleByteData = byteData;
		long longByteData = byteData;
		
		short shortData = 300;
		float floatShortData = shortData;
		double doubleShortData = shortData;
		long longShortData = shortData;
		
		System.out.println("Integer" +intData);
		System.out.println("Integer -> Float " +floatIntData);
		System.out.println("Integer -> Double " +doubleIntData);
		System.out.println("Integer -> Long " +longIntData);



		
		
		

	}

}
