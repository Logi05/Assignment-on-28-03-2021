package com.type;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TypeCastExample {
public static void main(String args[])
{
	System.out.println("Integer to String:");
	int n=50;
	String s=Integer.toString(n);
	String s1=String.valueOf(n);
	System.out.println(s);
	System.out.println(s1);
	
	System.out.println("String to Integer:");
	String s2="1000";
	int i=Integer.parseInt(s2);
	int i1=Integer.valueOf(s2);
	System.out.println(i);
	System.out.println(i1);
	
	String tdate="Fri, 04/03/2021, 23:37:50";
	Date date1=null;
	try
	{
		date1=new SimpleDateFormat("E, dd/MM/YYYY, HH:MM:SS").parse(tdate);
	}
	catch(ParseException e)
	{
		System.out.println(e);
	}
	//int n2=Integer.parseInt(tdate);
	System.out.println(date1);	
}
}