/**
 * 
 */
package com.hal.base.entity;

/**
 * @author hal
 *
 */
public class Circle {
     
	private  double r;
	/**
	 * 
	 */
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	public  double   area(double r) {
		 return  3.14*r*r;
	}
	/**
	 * @return the r
	 */
	public double getR() {
		return r;
	}
	/**
	 * @param r the r to set
	 */
	public void setR(double r) {
		this.r = r;
	}
	
}
