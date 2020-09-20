package ru.mirea.pr9.exercise1;

public class ClientTest {

	public static void main(String[] args) throws IncorrectInnException {
		Client client = new Client(
				"Ivan", "Ivanov", "Ivanovich",
				"123456789012"
		);
		System.out.println(client);

		try {
			Client client2 = new Client(
					"Ivan", "Ivanov", "Ivanovich",
					"123qwerty"
			);
			System.out.println(client2);
		} catch (IncorrectInnException e) {
			System.out.println(e.getMessage());
		}
	}
}
