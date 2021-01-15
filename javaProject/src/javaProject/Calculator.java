package javaProject;

public class Calculator {
	public static void main(String [] args) 
	{
		System.out.println("Calculator Start!!");
		
	}
	
	public int add(int a, int b)
	{
		return a+b;
	}
	
	public int minus(int a, int b)
	{
		return a-b;
	}
	
	public int multi(int a, int b)
	{
		return a*b;
	}
	
	public float divide(int a, int b)
	{
		
		if(b !=0) {
			return a/b;
		}
		else {
			return -1;
		}
	}
	

	public void additionalFunc() {
		  System.out.println("새로 추가된 함수!");
	  }
	
}
