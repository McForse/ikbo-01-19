package ru.mirea.pr11.exercise2;

import java.util.NoSuchElementException;

public interface Queue<E> {
	/**
	 * Добавляет элемент в конец очереди
	 *
	 * @param e элемент для добавления
	 * @return true, если элемент удачно добавлен, иначе - false
	 * @throws IllegalStateException если элемент не может быть добавлен в очередь
	 *          из-за ограничений размера
	 * @throws NullPointerException если передан null
	 */
	boolean add(E e);

	/**
	 * Добавляет элемент в конец очереди
	 *
	 * @param e элемент для добавления
	 * @return true, если элемент удачно добавлен, иначе - false
	 */
	boolean offer(E e);

	/**
	 * Возвращает с удалением элемент из начала очереди
	 *
	 * @return элемент очереди или {@code null}, если очередь пуста
	 * @throws NoSuchElementException, если очередь пуста
	 */
	E remove();

	/**
	 * Извлекает и удаляет элемент из очереди,
	 * или возвращает {@code null}, если очередь пуста
	 *
	 * @return элемент очереди или {@code null}, если очередь пуста
	 */
	E poll();

	/**
	 * возвращает, но не удаляет, элемент из начала очереди.
	 * Если очередь пуста, генерирует исключение NoSuchElementException
	 *
	 * @return элемент очереди
	 * @throws NoSuchElementException, если очередь пуста
	 */
	E element();

	/**
	 * Возвращает без удаления элемент из начала очереди
	 * или возвращает {@code null}, если очередь пуста
	 *
	 * @return элемент очереди или {@code null}, если очередь пуста
	 */
	E peek();
}
