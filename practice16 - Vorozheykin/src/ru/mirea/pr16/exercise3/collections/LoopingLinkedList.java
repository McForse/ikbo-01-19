package ru.mirea.pr16.exercise3.collections;

import java.util.Collection;

public class LoopingLinkedList<E> {
	private Node first, last;
	private int size = 0;

	class Node {
		E item;
		Node next;
		Node prev;

		Node(Node prev, E item, Node next) {
			this.item = item;
			this.next = next;
			this.prev = prev;
		}
	}

	public LoopingLinkedList() {
	}

	public LoopingLinkedList(Collection<? extends E> c) {
		addAll(c);
	}

	public boolean add(E item) {
		linkLast(item);
		return true;
	}

	public boolean addAll(Collection<? extends E> c) {
		return addAll(size, c);
	}

	@SuppressWarnings("unchecked")
	public boolean addAll(int index, Collection<? extends E> c) {
		checkIndex(index);
		Object[] objects = c.toArray();
		int numNew = objects.length;

		if (numNew == 0) {
			return false;
		}

		Node pred, succ;

		if (index == size) {
			succ = null;
			pred = last;
		} else {
			succ = node(index);
			pred = succ.prev;
		}

		for (Object obj : objects) {
			E e = (E) obj;
			Node newNode = new Node(pred, e, null);

			if (pred == null) {
				first = newNode;
			} else {
				pred.next = newNode;
			}

			pred = newNode;
		}

		if (succ == null) {
			last = pred;
		} else {
			pred.next = succ;
			succ.prev = pred;
		}

		size += numNew;
		return true;
	}

	public boolean remove(Object item) {
		if (item == null) {
			for (Node f = first; f != null; f = f.next) {
				if (f.item == null) {
					unlink(f);
					return true;
				}
			}
		} else {
			for (Node f = first; f != null; f = f.next) {
				if (item.equals(f.item)) {
					unlink(f);
					return true;
				}
			}
		}
		return false;
	}

	public int getSize() {
		return size;
	}

	private void checkIndex(int index) {
		if (!(index >= 0 && index < size)) {
			throw new IndexOutOfBoundsException();
		}
	}

	private void linkFirst(E item) {
		Node first = this.first;
		Node newNode = new Node(null, item, first);
		this.first = newNode;

		if (first == null) {
			last = newNode;
		} else {
			first.prev = newNode;
		}

		size++;
	}

	private void linkLast(E item) {
		Node last = this.last;
		Node newNode = new Node(last, item, null);
		this.last = newNode;

		if (last == null) {
			first = newNode;
		} else {
			last.next = newNode;
		}

		size++;
	}

	void linkBefore(E item, Node node) {
		Node pred = node.prev;
		Node newNode = new Node(pred, item, node);
		node.prev = newNode;

		if (pred == null) {
			first = newNode;
		} else {
			pred.next = newNode;
		}

		size++;
	}

	private void unlink(Node item) {
		Node next = item.next;
		Node prev = item.prev;

		if (prev == null) {
			first = next;
		} else {
			prev.next = next;
			item.prev = null;
		}

		if (next == null) {
			last = prev;
		} else {
			next.prev = prev;
			item.next = null;
		}

		item.item = null;
		size--;
	}

	private Node node(int index) {
		Node node;

		if (index < (size >> 1)) {
			node = first;
			for (int i = 0; i < index; i++)
				node = node.next;
		} else {
			node = last;

			for (int i = size - 1; i > index; i--) {
				node = node.prev;
			}
		}

		return node;
	}

	@SuppressWarnings("unchecked")
	public E[] toArray() {
		Object[] result = new Object[size];
		int i = 0;

		for (Node x = first; x != null; x = x.next) {
			result[i++] = x.item;
		}

		return (E[]) result;
	}
}