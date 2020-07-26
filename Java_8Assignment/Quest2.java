package com.epam.Java_8Assignment;
import java.util.*;
import java.util.stream.Collectors;
public class Quest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q r=new Q();
	}
	
	public static class Q{
		List<String> search(List<String> list) {
		   return list.stream()
		  .filter(s -> s.startsWith("a"))
		  .filter(s -> s.length() == 3)
		  .collect(Collectors.toList());
		}
	}
	
}
