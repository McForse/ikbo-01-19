package ru.mirea.pr10.exercise2;

public interface AbstractChairFactory {
	VictorianChair createVictorianChair();
	MagicChair createMagicanChair();
	FunctionalChair createFunctionalChair();
}
