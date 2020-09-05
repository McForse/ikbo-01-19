package ru.mirea.lab2.example2;

public class HumanTest {

	public static void main(String[] args) {
		Human human = new Human(
				"Ivan",
				"Ivanov",
				18,
				new Head("brown", "blue"),
				new Leg(90),
				new Hand(60)
		);

		System.out.println("Human before editing:\n" + human);

		human.setName("Peter");
		human.setSurname("Petrov");
		human.setAge(19);
		human.setHead(new Head("blond", "brown"));

		System.out.println("\nHuman after editing:\n" + human);
	}
}
