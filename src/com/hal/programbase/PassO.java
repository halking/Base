package com.hal.programbase;

import java.util.HashMap;
import java.util.Hashtable;

public class PassO<K, V> {
	HashMap< String , String >  map  = new HashMap<String , String>();
	Hashtable<K, V> hashtable = new Hashtable<K, V>();
	 public static void main(String[] args){
	        PassO p=new PassO();
	        p.start();
	    }
	    void start(){
	        Two t=new Two();
	        System.out.print(t.x+"");
	        Two t2=fix(t);
	        System.out.print(t.x+"" +t2.x);
	    }
	    Two fix(Two tt){
	        tt.x=42;
	        return tt;
	    }
}
