package ru.java4testers;

public class Test {
	public static void main(String[] args) {
		doSmthng("username");
		doSmthng("user");
		doSmthng("name");

		Simple s = new Simple();
		s.a = 12;
		System.out.println("Простое число выглядит как" + " " + number(s));

		Complicated n = new Complicated(314, 100);
		System.out.println("Число с дробью выглядит как" + " " + n.fractional());

		Fractional m = new Fractional(100, 0.13);
		System.out.println("Деление целого числа" + " " + m.b + " на дробное" + " " + m.c + " " + "будет равно" + " " + m.fractional());
	}

	public static void doSmthng(String smthng) {
		System.out.println("Hello," + " " + smthng + "!");
	}

	public static int number(Simple s) {
		return s.a;
	}

}