package com.java;

public class Up_Lo_Nu_Sy {

	public static void main(String[] args) {
String s="HonestRayan@1123@457&YYY";
StringBuffer upper=new StringBuffer(),lower=new StringBuffer(),number=new StringBuffer(),symbol=new StringBuffer();
//String[] split = s.split("");
for(int i=0;i< s.length();i++) {
	
//	System.out.println(s);
//	char c = s.charAt(i);
//	if(c >= 'A' && c <= 'Z') {
//		upper++;
//	}else if (c>='a'&& c<='z') {
//		lower++;  
//		
//	}else if (c>= '0'  &&  c<='9') {
//		number++;
//		
//	}else {
//		symbol++;
//	}
//	
//		
//	
//}System.out.println("upper     :" +upper);
//System.out.println("lower      :"+ lower);
//System.out.println("number     :"+number);
//System.out.println("symbol     :"+symbol);
if(Character.isLowerCase(s.charAt(i))) {
	lower.append(s.charAt(i));
}else if (Character.isUpperCase(s.charAt(i))) {
	upper.append(s.charAt(i));	
}else if (Character.isDigit(s.charAt(i))) {
	number.append(s.charAt(i));
}else {
	symbol.append(s.charAt(i));
}
}System.out.println("upper     :" +upper);
System.out.println("lower      :"+ lower);
System.out.println("number     :"+number);
System.out.println("symbol     :"+symbol);

}
}