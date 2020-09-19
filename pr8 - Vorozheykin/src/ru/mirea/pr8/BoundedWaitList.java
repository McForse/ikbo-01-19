package ru.mirea.pr8;

/**
 * @param <E> - generic type for list
 */
public class BoundedWaitList<E> extends WaitList<E> {
	private final int capacity;

	/**
	 * @param capacity - capacity of list
	 */
	public BoundedWaitList(int capacity) {
		super();
		this.capacity = capacity;
	}

	/**
	 * @return the capacity of list
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * @param element to add
	 */
	@Override
	public void add(E element) {
		if (content.size() < capacity) {
			super.add(element);
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	/**
	 * @return String representation of object
	 */
	@Override
	public String toString() {
		return "BoundedWaitList{" +
				"capacity=" + capacity +
				", content=" + content +
				'}';
	}
}
