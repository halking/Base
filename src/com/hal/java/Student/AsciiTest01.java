/**
 * 
 */
package com.hal.java.Student;

import java.util.Scanner;

/**
 * @author hal
 *
 */
public class AsciiTest01 {

	private static Scanner scanner;

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("请输入一个字符串：");
        scanner = new Scanner(System.in); 
        String  str  =   scanner.nextLine() ;
         int sum = 0;
        for (int i = 0; i < str.length(); i++) {
			 sum += str.charAt(i);
		}
       
    System.out.println("sum="+sum);
	}
}
