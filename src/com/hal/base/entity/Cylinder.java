/**
 * 
 */
package com.hal.base.entity;


/**
 * @author hal
 *
 */
public class Cylinder extends Circle {
     private  double  width;
     
     public double   volume( double r, double w) {
		   return   super.area(r)*w;
	}
     /**
	 * 
	 */
	public Cylinder() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}
	
}
