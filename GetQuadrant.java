package com.midgardabc;

public class GetQuadrant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(printCoordinates("a", "2"));
	}
	
	static String getQuadrant(String v, String h) {
		int ver = 0, hor = 0;
		hor = Integer.valueOf(h);
		if (v.equals("a"))
				ver = 0;
		if (v.equals("b"))
			ver = 1;
		if (v.equals("c"))
			ver = 2;
		if (v.equals("d"))
			ver = 3;
		if (v.equals("e"))
				ver = 4;
		if (v.equals("f"))
			ver = 5;
		if (v.equals("g"))
			ver = 6;
		if (v.equals("h"))
			ver = 7;
		if (v.equals("i"))
			ver = 8;
		return (hor - 1) * 64 + "_" + ver * 64;
				
	}
	
	static String printCoordinates(String v, String h) {
		return v + h + ":(" + getQuadrant(v, h).substring(getQuadrant(v, h).indexOf("_") + 1) + "px; " + getQuadrant(v, h).substring(0, getQuadrant(v, h).indexOf("_"))  + "px)";
	}

}
