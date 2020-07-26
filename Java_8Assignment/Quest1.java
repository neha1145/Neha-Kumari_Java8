package com.epam.Java_8Assignment;
import java.io.*; 
import java.util.*;
public class Quest1 {

	public static void main(String[] args) {
		Integer[] strArray= {1,2,3};
		List<Integer>strList=Arrays.asList(strArray);   
        System.out.println("\nThe average is :\n"+calculateAverage(strList));
	}
    
    public static double calculateAverage(List <Integer> marks) {
      Integer sum = 0;
      Integer count = 0;
      if(!marks.isEmpty() & marks.size()!=0) {
        for (Integer mark : marks) {
            sum += mark;
        }
        return sum.doubleValue() / marks.size();
      }
      return sum;
    }
} 