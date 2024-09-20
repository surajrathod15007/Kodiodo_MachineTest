package com.quastion.first;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.stream.Stream;

class Student
{
	private int rollno;
	private String name;
	private int marks;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Student(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	
	
}
public class StdDetails 
{
  
	public static void main(String[] args) 
	{
	  ArrayList<Student> std=new ArrayList();
	  std.add(new Student(101,"Rohit", 89));
	  std.add(new Student(102,"Suraj", 97));
	  std.add(new Student(103,"Ankush", 79));
	  std.add(new Student(104,"Virat", 67));
	  
	  //Stream<Student> a=std.sort(Comparator.comparingInt(null));
	   
	  
	  
	  for(Student st:std)
	  {
		  System.out.println("RollNo:"+st.getRollno()+" Name:"+st.getName()+" Marks"+st.getMarks());
	  }
	}  

}
