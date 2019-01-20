package Sohan_Day_13.CustomizedArrayList;

import static org.junit.Assert.*;

import org.junit.Test;


public class AppTest {
	StudentArrayList<Student> studentList = new StudentArrayList();

	Student st1 = new Student("Sohan", "1", 21);
	Student st2 = new Student("Tonmoy", "2", 21);
	Student st3 = new Student("Shaila", "3", 21);
	Student st4 = new Student("Rana", "4", 21);
	Student st5 = new Student("Lol", "5", 21);

	
	private void addnow() {
		studentList.add(st1);
 		studentList.add(st2);
 		studentList.add(st3);
 		studentList.add(st4);
 		studentList.add(st5);
	}
	
	@Test
	public void testadd() {
		assertTrue(studentList.add(st1));
		assertTrue(studentList.add(st2));
	}
	
	@Test
	public void testremove() {
		
		addnow();
		
		int x = studentList.size();
		studentList.remove(2);
		int y = studentList.size();

		assertEquals(x, y+1);
		assertFalse(studentList.search(st3));

	}
	
	@Test
	public void testSearch() {
		
		addnow();
		assertTrue(studentList.search(st1));

	}
	@Test
	public void testClear() {
		
		addnow();
		studentList.clear();
		
		int x = studentList.size();
		
		assertEquals(0, x);

	}

}
