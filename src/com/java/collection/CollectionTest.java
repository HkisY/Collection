package com.java.collection;

public class CollectionTest {
	public static void main(String[] args) {
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
	}
}
