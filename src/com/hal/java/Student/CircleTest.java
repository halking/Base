/**
 * 
 */
package com.hal.java.Student;

import java.util.Scanner;

import com.hal.base.entity.Circle;

/**
 * @author hal
 *
 */
public class CircleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 double[]  d = new double[5];
     Scanner  scanner = new Scanner(System.in);
     for (int i = 0; i < d.length; i++) {
	    d[i] =  scanner.nextDouble(); 
	}
     for (int i = 0; i < d.length; i++) {
     	Circle  circle= new Circle();
		double area = circle.area(d[i]);
		System.out.println("半径："+d[i]+"  面积："+area);
	}
	}

}
