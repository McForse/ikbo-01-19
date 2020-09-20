package ru.mirea.pr10.exercise2;

public class ChairsTest {

	public static void main(String[] args) {
		Client client = new Client();
		AbstractChairFactory factory = new ChairFactory();
		client.setChair(factory.createFunctionalChair());
		client.sit();
		client.setChair(factory.createMagicanChair());
		client.sit();
		client.setChair(factory.createVictorianChair());
		client.sit();
	}
}
