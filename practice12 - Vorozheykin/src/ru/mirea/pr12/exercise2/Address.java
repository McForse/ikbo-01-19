package ru.mirea.pr12.exercise2;

import java.util.StringTokenizer;

public class Address {
	private final String country;
	private final String region;
	private final String city;
	private final String street;
	private final String house;
	private final String apartment;

	public Address(String fullAddress) {
		String[] result = fullAddress.split(",");
		if (result.length != 6) throw new IllegalArgumentException("Incorrect address format");
		this.country = result[0].trim();
		this.region = result[1].trim();
		this.city = result[2].trim();
		this.street = result[3].trim();
		this.house = result[4].trim();
		this.apartment = result[5].trim();
	}

	public Address(String fullAddress, String delim) {
		StringTokenizer result = new StringTokenizer(fullAddress, delim);
		if (result.countTokens() != 6) throw new IllegalArgumentException("Incorrect address format");
		this.country = result.nextToken().trim();
		this.region = result.nextToken().trim();
		this.city = result.nextToken().trim();
		this.street = result.nextToken().trim();
		this.house = result.nextToken().trim();
		this.apartment = result.nextToken().trim();
	}

	public Address(String country, String region, String city, String street, String house, String apartment) {
		this.country = country;
		this.region = region;
		this.city = city;
		this.street = street;
		this.house = house;
		this.apartment = apartment;
	}

	@Override
	public String toString() {
		return "Address{" +
				"country='" + country + '\'' +
				", region='" + region + '\'' +
				", city='" + city + '\'' +
				", street='" + street + '\'' +
				", house='" + house + '\'' +
				", apartment='" + apartment + '\'' +
				'}';
	}
}
