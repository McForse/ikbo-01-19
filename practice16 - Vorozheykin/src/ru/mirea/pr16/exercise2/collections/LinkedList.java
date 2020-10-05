package ru.mirea.pr16.exercise2.collections;

import java.util.Collection;

public class LinkedList<E> {
	private Node first, last;
	private int size;

	class Node {
		E value;
		Node next;

		public Node(E item) {
			this.value = item;
		}
	}

	public LinkedList() {
		this.size = 0;
	}

	public boolean add(E item) {
		Node node = new Node(item);

		if (first == null) {
			last = node;
			first = last;
		} else {
			last.next = node;
			last = last.next;
		}

		size++;
		return true;
	}

	@SuppressWarnings("unchecked")
	public boolean addAll(Collection<? extends E> collection) {
		Object[] objects = collection.toArray();

		for (Object object : objects) {
			add((E) object);
		}

		return true;
	}

	public boolean remove(E item) {
		Node current = first;

		if (first == null) {
			return false;
		} else if (first.value == item) {
			first = first.next;
			size--;
			return true;
		}

		while (current.next != null && current.next.value != item) {
			current = current.next;
		}

		if (current.next != null) {
			current.next = current.next.next;
			size--;
			return true;
		}

		return false;
	}

	public int getSize() {
		return size;
	}

	@SuppressWarnings("unchecked")
	public E[] toArray() {
		Object[] result = new Object[size];
		int i = 0;

		for (Node x = first; x != null; x = x.next) {
			result[i++] = x.value;
		}

		return (E[]) result;
	}
}
