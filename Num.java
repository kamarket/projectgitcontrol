package com.java;

import java.util.Scanner;

public class Num {
	int i = 10;

	public static void main(String[] args) {
		System.out.println("enter te number");  //11 12 13 21 22 23 31 32 33
		try (Scanner i = new Scanner(System.in)) {
			int i2 = i.nextInt();
			System.out.println("enter the first number" + i2);
			int i1 = i.nextInt();
			System.out.println("enter the last numer" + i1);
			for(int j=i2;j<=i1;j++) {
				System.out.println(j);
			}
		}
	}
}
