package com.hal.programbase;

public class Two {
      	Byte x;
      	static int t  = 6 ;
      	public  String lei(){
			return null;
      	}
      	@SuppressWarnings({ "unused", "static-access" })
		public static void main(String[] args) {
      		Two  two = new Two();
      		String   str1= "huang alin";
      		str1 +=" a";
      		str1 = str1 + "100";
      		System.out.println(str1);
      		byte b1=1,b2=2,b3,b6; 
      		int x1=2,x3=5,x2;
      		long l1,l2=1,l3=6;
      		final byte b4=122,b5=6; 
      		b6=(byte) (b4+b5); 
      		 b3=(byte) (b1+b2); 
      		 l1=b1+b2;
      		 x2= (int) (l2+l3);
      		 l2 = x2+x3;
      		/* System.out.println(b6);
      		System.out.println(b3+b6);
      		System.out.println(l1);
      		System.out.println(l2);*/
      		 System.out.println(t);
           two.t  = 5;
          System.out.println(t);
		}
}
