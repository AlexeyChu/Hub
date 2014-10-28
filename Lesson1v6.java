package com.midgardabc;

public class Lesson1v6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Education is the most powerful weapon which you can use to change the world";
		String t = "AN investment in knowledge pays the best interest.";
		String subs = s.substring(s.indexOf("use"), s.indexOf("use") + 3);
		String subt = t.substring(t.indexOf(" knowledge"), t.indexOf(" knowledge") + 10);
		String sub1 = subs + subt;
		String sub2 = s.substring(s.indexOf(" to change the world"));
		String fins = sub1 + sub2;
		System.out.println(fins);

	}

}
