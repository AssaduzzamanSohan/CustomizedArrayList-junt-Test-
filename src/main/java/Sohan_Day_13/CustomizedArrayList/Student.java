package Sohan_Day_13.CustomizedArrayList;

public class Student {
	private String name;
	private String id;
	private int age;
	
	public Student(String name, String id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age + "]";
	}
}
