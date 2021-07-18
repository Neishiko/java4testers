package ru.java4testers;

public class Fractional {
	public int b;
	public double c;

	public Fractional(int b, double c) {
		this.b = b;
		this.c = c;
	}

	public double fractional() {
		return this.b / this.c;
	}
}
