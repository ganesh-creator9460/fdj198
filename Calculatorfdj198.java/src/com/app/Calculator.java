package com.app;

public class Calculator {

	public void add(int a,int b)
	{
		System.out.println("Addition of "+a+" and "+b+" is :"+(a+b));
	}
	public void sub(int a,int b)
	{
		System.out.println("Subtraction of "+a+" and "+b+" is :"+(a-b));
	}
	public void division(int a,int b)
	{
		System.out.println("Division of "+a+" and "+b+" is :"+(a/b));
	}
	public void mul(int a,int b)
	{
		System.out.println("Multiplication of "+a+" and "+b+" is :"+(a*b));
	}
	public void mod(int a,int b)
	{
		System.out.println("Mod of "+a+" and "+b+" is :"+(a%b));
	}
	
	
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		c.add(10,5);
		c.sub(10, 5);
		c.division(10, 5);
		c.mul(10, 5);
		c.mod(10,5);
	}
}
