package com.hal.niuke.mianshi;

public class different {
	public different(String str) {
		// TODO Auto-generated constructor stub
	}
	public boolean checkDifferent(String iniString) {   
		return !iniString.matches(".*(.)(.*\\1).*");
		}
      public static void main(String[] args) {
		   String str = "huangli";
		   different d = new different("a");
		   boolean b=  d.checkDifferent(str);
		   System.out.println(b);
		   different d1 = new different("a");
		   different d2 = new different("a");
		   System.out.println(d1==d2);
		   System.out.println(d1.equals(d2));
	}
}
