package ru.mirea.lab16.models;

import ru.mirea.lab16.enums.DrinkTypeEnum;
import ru.mirea.lab16.interfaces.Alcoholable;

public class Drink extends MenuItem implements Alcoholable {
	private double alcoholVol;
	private DrinkTypeEnum type;

	public Drink(double alcoholVol, DrinkTypeEnum type) {
		this.alcoholVol = alcoholVol;
		this.type = type;
	}

	@Override
	public boolean isAlcoholicDrink() {
		return type.isAlcohol();
	}

	@Override
	public double getAlcoholVol() {
		return alcoholVol;
	}
}
