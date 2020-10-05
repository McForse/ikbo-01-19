package ru.mirea.pr11.exercise2;

import java.util.ArrayList;

public class LinkedQueue<E> extends AbstractQueue<E> {
	protected ArrayList<E> data;

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
		if (data == null) {
			return null;
		}

		E e = data.get(0);
		data.remove(0);
		return e;
	}

	@Override
	public E peek() {
		return data == null ? null : data.get(0);
	}
}
