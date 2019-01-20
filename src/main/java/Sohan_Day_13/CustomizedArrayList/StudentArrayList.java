package Sohan_Day_13.CustomizedArrayList;

public class StudentArrayList<T>{
	private Object[] array; 
	public static final int DEFAULT_SIZE = 2; // Fixing the default value of array size
	private int size = 0;

	public StudentArrayList() { 
		this(DEFAULT_SIZE);
	}

	public StudentArrayList(int size) {
		array = new Object[size];
	}

	public boolean add(T element) { // Adding new element in array
		ensureCapacity(); // Ensuring element can be added
		array[size++] = element; // Adding the element in array
		
		return true;
	}

	public T remove(int index) { // Removing a element depending on index value
		if (index >= size || index < 0) {
			throw new RuntimeException("Invalid index");
		}
		T element = (T) array[index]; // Taking the element of given index
		array[index] = null;
		--size; 
		System.arraycopy(array, index + 1, array, index, size - index); // Copying all element after the remove point into their previous position
	    array[size] = null; 
		return element;
	}

	public T get(int index) { // Getting the element of given index
		if (index > size) {
			throw new RuntimeException("Invalid index");
		}
		T element = (T) array[index];
		return element;
	}

	public int size() {
		return this.size;
	}

	private void ensureCapacity() { // Ensuring capacity 
		if (size < array.length) {
			return;
		}
		resize(); // If we need to increase array size
	}

	private void resize() {
		Object[] temp = new Object[array.length * 2]; // Making a new array with 2*size
		copy(array, temp); // Copying all element of array in temp
		array = temp; // Copying all element of temp in array
	}

	private void copy(Object[] src, Object[] dest) {
		if (dest.length < src.length) {
			throw new RuntimeException(src + " cannot be copied into " + dest);
		}
		for (int i = 0; i < src.length; i++) {
			dest[i] = src[i];
		}
	}
	public void clear() { // Clearing all element of the List
		for(int i=size-1; i>=0; i--) {
			remove(i);
		}
	}
	
	
	public boolean search(Student st) { // Removing a element depending on index value
		
		for(int i=0; i<size; i++) {
			if(array[i].equals(st)) return true;
		}
		
		return false;
	}
	
}
