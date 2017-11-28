package com.java.collection;

public class CollectionTest {
	public static void main(String[] args) {
		/*
		 * MyLinkedlist TEST
		 */
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.addLast("A");
		myLinkedList.addLast("B");
		myLinkedList.addLast("C");
		System.out.println(myLinkedList);
		myLinkedList.addFirst(1);
		myLinkedList.addFirst(0);
		System.out.println(myLinkedList);
		
		myLinkedList.delete(0);
		System.out.println(myLinkedList);
		
		System.out.println(myLinkedList.search("C"));
		/*
		 * MyArrayList TEST
		 */
		MyArrayList list = new MyArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		list.add(1);
		list.add(2);
		System.out.println(list);
		int index = list.find(2);
		System.out.println(index);
		list.delete("C");
		System.out.println(list);
		Object o = list.get(0);
		System.out.println(o);
	}
}
