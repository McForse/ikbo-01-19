package ru.mirea.pr10.exercise2;

public class MagicChair implements Chair {
	public void doMagic() {
		System.out.println("Magic chair is doing magic");
	}

	@Override
	public String toString() {
		return "MagicChair";
	}
}
