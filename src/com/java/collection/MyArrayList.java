package com.java.collection;

import java.util.Arrays;

public class MyArrayList {
	private Object[] element = null;
	private int size = 0;
	private static final int INIT_NUMBER = 6;
	
	public MyArrayList() {
		element = new Object[INIT_NUMBER];
	}
	
	public MyArrayList(int init) {
		if (init < 0) {
			throw new IllegalArgumentException("容量不能为空");
		}
		element = new Object[init];
	}

	public void add(Object obj) {
		// determine the capacity
		if (size == element.length) {
			Object[] temp = Arrays.copyOf(element, element.length * 2);
			element = temp;
		}
		element[size] = obj;
		size++;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder(size * 2 + 1);
		if (size == 0) {
			return "[]";
		}
		sb.append("[");
		for (int i = 0; i < size; i++) {
			sb.append(element[i]);
			if (i != size - 1) {
				sb.append(",");
			} else {
				sb.append("]");
			}
		}
		return sb.toString();
	}


	public int find(Object obj) {
		for (int i = 0; i < size; i++) {
			if(element[i].equals(obj)){
				return i;
			}
		}
		return -1;
	}

	public void delete(Object obj) {
		int index = find(obj);
		if(index != -1){
			for (int i = index; i <= size; i++) {
				Object temp = element[i+1];
				element[i] = temp;
			} 
		}
		size--;
	}
	
	public Object get(int i) {
		if(i >= size||i < 0){
			throw new IllegalArgumentException("out of bound");
		}
		return element[i];
	}

}
