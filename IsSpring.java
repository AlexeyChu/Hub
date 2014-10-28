package com.midgardabc;

public class IsSpring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isSpring(4));

	}
	
	static int isSpring(int month) {
		if (month > 0 && month < 13) 
			if (month == 3 || month == 4 || month == 5)
				return 1;
			else
				return 0;
		else
			return -1;
	}

}
