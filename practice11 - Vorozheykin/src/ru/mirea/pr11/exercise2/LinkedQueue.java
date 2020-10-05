package ru.mirea.pr11.exercise2;

import java.util.LinkedList;

public class LinkedQueue<E> extends AbstractQueue<E> {
	protected LinkedList<E> data;

	public LinkedQueue() {
		this.data = new LinkedList<>();
	}

	@Override
	public int size() {
		return data.size();
	}

	@Override
	public boolean offer(E e) {
		return data.add(e);
	}

	@Override
	public E poll() {
		if (data.isEmpty()) {
			return null;
		}

		E e = data.getFirst();
		data.removeFirst();
		return e;
	}

	@Override
	public E peek() {
		return data.isEmpty() ? null : data.get(0);
	}
}
