package com.midgardabc;

public class MinOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(min(100,400,90));
	}
	
	
	static int min(int a, int b, int c) {
		if (a > b) {
			if (b > c)
				return c;
			else 
				return b;
		}
		else
			if (a < c)
				return a;
			else 
				return c;
	}

}
