package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IlteratorConcepts {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		li.add(60);

		System.out.println(li);

		Iterator<Integer> iter = li.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		ListIterator<Integer> listIter = li.listIterator();
		while (listIter.hasNext()) {
			System.out.println(listIter.next());
		}

		while (listIter.hasPrevious()) {
			System.out.print(listIter.previous()+ " ");
		}
	}
}
