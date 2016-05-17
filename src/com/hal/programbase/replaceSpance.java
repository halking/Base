package com.hal.programbase;

import java.lang.management.ManagementFactory;

public class replaceSpance {
	    StringBuffer sb = new StringBuffer("we are happy");
	    public String  replaceStr(StringBuffer str){
	    	return  str.toString().replaceAll( "\\s", "%20");
	    }
        public String replacespace(StringBuffer str){
        	 StringBuffer out=new StringBuffer();
             for (int i = 0; i < str.toString().length(); i++) {
                 char b=str.charAt(i);
                 if(String.valueOf(b).equals(" ")){
                     out.append("%20");
                 }else{
                     out.append(b);
                 }
             }
             return out.toString(); 
        }
        public static void main(String[] args) {
			replaceSpance replaceSpance   = new replaceSpance();
		 String str = 	replaceSpance.replacespace(replaceSpance.sb);
		 System.out.println(str);
	     System.out.println(replaceSpance.replaceStr(replaceSpance.sb));	
	     long  used = ManagementFactory.getMemoryMXBean().getHeapMemoryUsage().getUsed();
	     System.out.println(used);
			
		}
}
