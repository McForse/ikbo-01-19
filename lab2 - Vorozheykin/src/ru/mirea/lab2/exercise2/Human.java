package ru.mirea.lab2.exercise2;

public class Human {
	private String name;
	private String surname;
	private int age;

	private Head head;
	private Leg leg;
	private Hand hand;

	public Human(String name, String surname, int age, Head head, Leg leg, Hand hand) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.head = head;
		this.leg = leg;
		this.hand = hand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Head getHead() {
		return head;
	}

	public void setHead(Head head) {
		this.head = head;
	}

	public Leg getLeg() {
		return leg;
	}

	public void setLeg(Leg leg) {
		this.leg = leg;
	}

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

	@Override
	public String toString() {
		return "Human{" +
				"name='" + name + '\'' +
				", surname='" + surname + '\'' +
				", age=" + age +
				", head=" + head +
				", leg=" + leg +
				", hand=" + hand +
				'}';
	}
}
