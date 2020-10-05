package ru.mirea.pr12.exercise4;

public class PhoneNumber {
	private final String countryCode;
	private final String areaCode;
	private final String prefix;
	private final String subscriberNumber;

	public PhoneNumber(String data) {
		if (data.matches("^(\\+\\d{11}|\\d{11})$")) {
			if (data.length() == 12) {
				countryCode = String.valueOf(data.charAt(1));
				areaCode = data.substring(2, 5);
				prefix = data.substring(5, 8);
				subscriberNumber = data.substring(8, 12);
			} else {
				countryCode = String.valueOf((Integer.parseInt(String.valueOf(data.charAt(0))) - 1));
				areaCode = data.substring(1, 4);
				prefix = data.substring(4, 7);
				subscriberNumber = data.substring(7, 11);
			}
		} else {
			throw new IllegalArgumentException("Incorrect phone format");
		}
	}

	public PhoneNumber(String countryCode, String areaCode, String prefix, String subscriberNumber) {
		this.countryCode = countryCode;
		this.areaCode = areaCode;
		this.prefix = prefix;
		this.subscriberNumber = subscriberNumber;
	}

	@Override
	public String toString(){
		return "+" + countryCode + areaCode + "-" + prefix + "-" + subscriberNumber;
	}
}
