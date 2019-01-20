package Sohan_Day_13.CustomizedArrayList;

import java.awt.List;
import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
    	StudentArrayList<Student> studentList = new StudentArrayList();

 		Student st1 = new Student("Sohan", "1", 21);
 		Student st2 = new Student("Tonmoy", "2", 21);
 		Student st3 = new Student("Shaila", "3", 21);
 		Student st4 = new Student("Rana", "4", 21);
 		Student st5 = new Student("Lol", "5", 21);

 		
 		studentList.add(st1);
 		studentList.add(st2);
 		studentList.add(st3);
 		studentList.add(st4);
 		studentList.add(st5);
 	
 		
 		for(int i=0;i<studentList.size();i++){
 		    System.out.println(studentList.get(i));
 		} 
    	System.out.println("=================");
    	
 		
 		studentList.remove(2-1);
    	
    	
 		
 		for(int i=0;i<studentList.size();i++){
 		    System.out.println(studentList.get(i));
 		} 
    	System.out.println("=================");
    	System.out.println(studentList.size());
    	studentList.clear();
    	System.out.println("=================");
    	for(int i=0;i<studentList.size();i++){
 		    System.out.println(studentList.get(i));
 		} 
    	System.out.println("=================");
    	System.out.println(studentList.size());
    }
}
