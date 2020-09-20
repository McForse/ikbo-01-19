package ru.mirea.pr10.exercise2;

public class ChairFactory implements AbstractChairFactory {
	@Override
	public VictorianChair createVictorianChair() {
		return new VictorianChair(500);
	}

	@Override
	public MagicChair createMagicanChair() {
		return new MagicChair();
	}

	@Override
	public FunctionalChair createFunctionalChair() {
		return new FunctionalChair();
	}
}
