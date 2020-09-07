package ru.mirea.lab3.exercise3;

import java.util.*;

public class FurnitureShop {
	private String name;
	private List<Furniture> furnitureList;

	public FurnitureShop(String name) {
		this.name = name;
		this.furnitureList = new ArrayList<>();
	}

	public FurnitureShop(String name, List<Furniture> furnitureList) {
		this.name = name;
		this.furnitureList = furnitureList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Furniture> getFurnitureList() {
		return furnitureList;
	}

	public void setFurnitureList(List<Furniture> furnitureList) {
		this.furnitureList = furnitureList;
	}

	public void add(Furniture furniture) {
		furnitureList.add(furniture);
	}

	public long amountOf(String furniture) {
		return furnitureList.stream()
				.filter(f -> f.getName().equals(furniture))
				.count();
	}

	public int quantityInStock() {
		return furnitureList.size();
	}

	@Override
	public String toString() {
		return "FurnitureShop{" +
				"name='" + name + '\'' +
				", furnitureList=" + furnitureList +
				'}';
	}
}
