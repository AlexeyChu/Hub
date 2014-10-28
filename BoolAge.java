package com.midgardabc;

public class BoolAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(oldEnough(40));
			
	}
	
	static boolean oldEnough(int age) {
		if (age >= 21)
			return true;
		else
			return false;
	}

}
