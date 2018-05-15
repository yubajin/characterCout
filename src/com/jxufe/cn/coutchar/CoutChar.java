package com.jxufe.cn.coutchar;

public class CoutChar {
	public void coutChar(String str,int res[]){
		for(int i=0; i<str.length();i++){
			char c=str.charAt(i);
			
			if((c>='a' && c<='z') || (c>='A' && c<='Z')){
				Character charc = new Character(c);
				c=Character.toLowerCase(charc);
				res[c-'a']++;
			}
		}
		
		for(int i=0;i<res.length;i++){
			System.out.println((char)(i+'a')+":"+res[i]);
		}
	}
}