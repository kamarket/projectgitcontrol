package com.java;
public class Const_Clas {

	Const_Clas(){
		this(7);
		System.out.println("selinium");
	}
	Const_Clas(int b) {
		this("word");
		System.out.println(b);
	}
	private Const_Clas(String b) {
		
		System.out.println(b);
	}

	
//	private Const_Clas(String g,int r) {
//		this(8);
//		String d="selinium";
//		System.out.println(d);
//		int h=18;
//		System.out.println(h);
//	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Const_Clas h = new Const_Clas();
//		Const_Clas h1 = new Const_Clas("");
//		Const_Clas h2 = new Const_Clas("selinium",12);
		}

}
