package com.java.Generics;

public class MainSorted {
	public static void main(String[] args) {
		ShortLinkList<Integer> sortedLinkedList = new ShortLinkList<>();
		for (int i : new int[] { 56, 30, 40, 70 }) {
			sortedLinkedList.addSorted(i);
		}
		sortedLinkedList.displaySorted();
	}
}
