package com.factorial.app;

public class factorial_number 
{

	public static void main(String[] args) 
	{
	    double factorial = 1;
	    double numero=30;
	    
	    while ( numero!=0) 
	    {
	        factorial=factorial*numero;
	        numero--;
	      }
	    
	    System.out.println(factorial);

	}

}
