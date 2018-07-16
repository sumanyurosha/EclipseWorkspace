package com.fil.basic;

public class StringDemo {

	public static void main(String args[]){
		
		String str = "  Hello     Fraaaands    Chai   peeelo.....";
		String str2 = "";
		str.trim();
		String s[] = str.split("[ ]+");
		for(int i =0;i<s.length;i++){
			str2+=s[i];
			str2+=" ";
		}
		System.out.println(str2.trim());
		String myStr = "hello fraands chai peelo!";
		myStr = myStr.substring(0, 1).toUpperCase() + myStr.substring(1);
		for(int i=0;i<myStr.length();i++){
			if(myStr.charAt(i) == ' '){
				myStr = myStr.substring(0, i+1) + myStr.substring(i+1, i+2).toUpperCase() + myStr.substring(i+2);
	
			}
		}
		System.out.println(myStr);
	}

}
