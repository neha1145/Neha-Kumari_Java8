package com.epam.Java_8Assignment;

import java.util.*;
import java.util.function.Predicate;
class isPalindrome{
	public static boolean palin(String st) {
		char[] a=st.toCharArray();
		int l=a.length;
		char[] rev=new char[l];
		int d=0;
		for(int i=l-1;i>=0;i--)
		{
			rev[d]=a[i];
			d++;
		}
		d=0;
		for(int i=0;i<l;i++)
		{
			if(rev[i]==a[i])
				d++;
		}
		return d==l;
			
	}
}

public class Question3 {

	public static void main(String[] args) {
		String[] strArray= {"dad","neha","dog"};
		List<String>strList=Arrays.asList(strArray);
		List<String>listPalindrome=filterPalindrome(strList,isPalindrome::palin);
		System.out.println(listPalindrome);
	}
	public static List<String> filterPalindrome(List<String> strList,Predicate<String> predicate){
		List<String> palindStr=new ArrayList<>();
		for(String st:strList) {
			if(predicate.test(st)){
				palindStr.add(st);
			}
		}
		return palindStr;
	}
}
