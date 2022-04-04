package com.cts.automation.list;

import java.util.LinkedList;
import java.util.List;

public class ListUsingArray {

	public static void main(String[] args) {
		String a[][]= {{"C","C++","JAVA","J2EE"},{"HTML","CSS","JAVASCRIPT","R PROGRAMMING"},{".NET","VBSCRIPT","PHP","PYTHON"}};
		int i,j;
		List<Object> as=new LinkedList<>();
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
			as.add(a[i][j]);
			System.out.println(as);
			}
		}
	
	}
}
