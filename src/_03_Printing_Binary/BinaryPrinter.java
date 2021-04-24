package _03_Printing_Binary;

import java.util.Iterator;

public class BinaryPrinter {
	/*
	 * Complete the methods below so they print the passed in parameter in binary.
	 * Do not use the Integer.toBinaryString method!
	 * Use the main method to test your methods.
	 */

	
	public static void printByteBinary(byte b) {
		// We first want to print the bit in the one's place
		for (int i = 7; i > -1; i--) {
			int shifted = b >> i;
			shifted = shifted & 1;
			System.out.print(shifted);
		}
		// Shift b seven bits to the right

		// Use the & operator to "mask" the bit in the one's place
		// This can be done by "anding" (&) it with the value of 1

		// Print the result using System.out.print (NOT System.out.println)

		//Use this method to print the remaining 7 bits of b
	}
	
	public static void printShortBinary(short s) {
		// Create 2 byte variables

		// Use bit shifting and masking (&) to save the firs
		// 8 bits of s in one byte, and the second 8 bits of
		// s in the other byte
			byte top = (byte) (s >> 8);
			byte bottom = (byte) s;
		
		// Call printByteBinary twice using the two bytes
		// Make sure they are in the correct order
		
		printByteBinary(top);
		printByteBinary(bottom);
	}
	
	public static void printIntBinary(int i) {
		// Create 2 short variables
		short top;
		short bottom;
		// Use bit shifting and masking (&) to save the first
		// 16 bits of i in one short, and the second 16 bits of
		// i in the other short
		
		top = (short) (i >> 16);
		bottom = (short) i;
		
		// Call printShortBinary twice using the two short variables
		// Make sure they are in the correct order
		printShortBinary(top);
		printShortBinary(bottom);
	}
	
	public void printLongBinary(long l) {
		// Use the same method as before to complete this method
		int top;
		int bottom;
		
		top = (int) (l >> 32);
		bottom = (int) l;
		
		printIntBinary(top);
		printIntBinary(bottom);
	}
	
	public static void main(String[] args) {
		// Test your methods here
		BinaryPrinter b = new BinaryPrinter();
		b.printByteBinary((byte) 28);
		System.out.println();
		b.printShortBinary((short)23865);
		System.out.println();
		b.printIntBinary(13589028);
		System.out.println();
		b.printLongBinary(4218947343892532190L);
	}
}
