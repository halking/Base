/**
 * 
 */
package com.hal.java.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hal
 *
 */
public class ArrayTest01 {
   
	static  Student[] students =new  Student[10];
	int  k =1;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<Student>  ls = new ArrayList<Student>();
    for (int i = 0; i < students.length; i++) {
		ls.add(new  Student("huang"+i,"男",22));
	}
    for (int i = 0; i < ls.size(); i++) {
		ls.get(i).age++;
	}
    for (int i = 0; i < ls.size(); i++) {
		System.out.println(ls.get(i).getName()+ls.get(i).getAge()+ls.get(i).getSex());
	}
	}
  
}
