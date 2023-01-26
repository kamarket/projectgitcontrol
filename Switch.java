package com.java;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
        for(int i=0;i<=12;i++) {
		System.out.println("enter the number");
		 try (Scanner calender = new Scanner(System.in)) {
			int month =calender.nextInt();
			switch (month) {
			case 12: {
				System.out.println("december");
				break;
			}
			case 10: {
				System.out.println("october");
				break;
			}
			case 9: {
				System.out.println("september");
				break;
			}case 8: {
				System.out.println("aug");
				break;
			}case 3: {
				System.out.println("march");
				break;
			}
			default:
				System.out.println("invalid");
			}
		}
		}

	}

}
