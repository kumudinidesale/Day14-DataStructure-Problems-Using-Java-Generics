package com.java.Generics;

import java.util.Scanner;

public class LinkList {
	Scanner scanner = new Scanner(System.in);

	Node head;

	class Node {
		Object data;
		Node next;// next is a reference

		public Node(Object data) {
			this.data = data;
		}
	}

	/*
	 * add first method
	 */
	public void addFirst(Object data) {
		Node newNode = new Node(data);
		if (head == null)
			head = newNode;
		else {
			newNode.next = head;
			head = newNode;
		}
	}

	/*
	 * display linked list method
	 */
	public void display() {
		if (head == null)
			System.out.println("No elements to display");
		else {
			Node temp = head;
			while (temp.next != null) {
				System.out.print(temp.data + " -> ");
				temp = temp.next;
			}
			System.out.println(temp.data);
		}
	}

	/*
	 * Add last method
	 */
	public void addLast(Object data) {
		Node newNode = new Node(data);
		if (head == null)
			head = newNode;
		else if (head.next == null)
			head.next = newNode;
		else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	/*
	 * add middle method
	 */

	public void addMiddle(Object data, Object data1) {
		Node newNode = new Node(data);

		if (head == null)
			head = newNode;
		else {
			Node temp = head;
			while (temp.data != data1) {
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;
		}
	}

	/*
	 * delete last method
	 */
	public void deleteFirst() {
		if (head == null)
			System.out.println("No elements present to delete");
		else
			head = head.next;
	}

}
