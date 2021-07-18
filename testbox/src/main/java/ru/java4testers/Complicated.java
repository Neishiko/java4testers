package ru.java4testers;

public class Complicated {
	public double b;
	public double c;

	public Complicated(double b, double c) {
		this.b = b;
		this.c = c;
	}

	public double fractional() {
		return this.b / this.c;
	}
}
