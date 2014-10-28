package com.midgardabc;

public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(System.currentTimeMillis());
		double value = Math.random() * 100;
		String s = Double.toString(value);
		System.out.println(value);
		System.out.println(s.substring(0, s.indexOf(".")));
		System.out.println(s.substring(s.indexOf(".") + 1));
		
		
	}

}
