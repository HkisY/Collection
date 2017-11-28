package com.java.collection;

import javax.lang.model.element.Element;

public class MyLinkedList {
	private Node first;
	private Node last;
	private int size = 0;

	// node
	class Node {
		Object ele;
		Node next;
		Node prev;

		public Node(Object obj) {
			ele = obj;
		}
	}

	public void addLast(Object ele) {
		Node node = new Node(ele);
		if (size == 0) {
			this.first = node;
			this.last = node;
		} else {
			this.last.next = node;
			node.prev = this.last;

			this.last = node;
		}
		size++;
	}

	public String toString() {
		if (size == 0) {
			return "[]";
		}
		StringBuilder sb = new StringBuilder(size * 2 + 1);
		sb.append("[");
		Node current = this.first;
		for (int i = 0; i < size; i++) {
			sb.append(current.ele);
			if (i != size - 1) {
				sb.append(",");
			} else {
				sb.append("]");
			}
			current = current.next;
		}
		return sb.toString();
	}

	public void addFirst(Object ele) {
		Node node = new Node(ele);
		if (size == 0) {
			this.first = node;
			this.last = node;
		} else {
			this.first.prev = node;
			node.next = this.first;

			this.first = node;
		}
		size++;
	}

	public void delete(Object ele) {
		Node current = this.first;
		// find the ele which is been deleted
		for (int i = 0; i < size; i++) {
			if (!current.ele.equals(ele)) {
				if (current.next == null) {
					return;
				} 
				current = current.next;
			}

		}
		//delete the node;
		if(current == first){
			this.first = current.next;
			this.first.prev = null;
		}else if (current == last) {
			this.last = current.prev;
			this.last.next = null;
		}else {
			current.prev.next = current.next;
			current.next.prev = current.prev;
		}
		size--;
	}


	public Node search(Object ele) {
		Node current = this.first;
		for (int i = 0; i < size; i++) {
			if (!current.ele.equals(ele)) {
				if (current.next == null) {
					return null;
				} 
				current = current.next;
			}

		}
		return current;
	}

}
