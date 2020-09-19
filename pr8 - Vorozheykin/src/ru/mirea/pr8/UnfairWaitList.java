package ru.mirea.pr8;

/**
 * @param <E> - generics type for list
 */
public class UnfairWaitList<E> extends WaitList<E> {

	public UnfairWaitList() {
		super();
	}

	/**
	 * @param element to delete if not at the head of the list
	 */
	public void remove(E element) {
		if (content.peek() != element) {
			content.remove(element);
		}
	}

	/**
	 * @param element add or move to end of list
	 */
	public void moveToBack(E element) {
		if (contains(element)) {
			add(element);
			content.remove(element);
		} else {
			add(element);
		}
	}
}
