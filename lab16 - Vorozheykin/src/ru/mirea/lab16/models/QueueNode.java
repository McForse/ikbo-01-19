package ru.mirea.lab16.models;

import ru.mirea.lab16.interfaces.Order;

public class QueueNode {
	protected QueueNode next;
	protected QueueNode prev;
	protected Order value;

	public QueueNode getNext() {
		return next;
	}

	public void setNext(QueueNode next) {
		this.next = next;
	}

	public QueueNode getPrev() {
		return prev;
	}

	public void setPrev(QueueNode prev) {
		this.prev = prev;
	}

	public Order getValue() {
		return value;
	}

	public void setValue(Order value) {
		this.value = value;
	}
}
