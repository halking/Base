package com.hal.resource;

public class Produce implements Runnable {
         public Storage storage;
         public  int  num;
         public Produce(Storage storage,int n) {
			// TODO Auto-generated constructor stub
        	 this.storage =storage;
        	 num = n;
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			storage.produce(num);
		} 
}
