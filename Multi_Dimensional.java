package com.java;

public class Multi_Dimensional {

	public static void main(String[] args) {
		int b[][] = new int[5][5];
		b[1][2] = 30;
		b[3][3] = 60;
		b[4][4] = 70;
		System.out.println(b.length);
		for (int i = 0; i < b.length; i++) {
			for(int j=0;j<b.length;j++) {
				System.out.println(b[i][j]); 

			}
		}
	}

}
