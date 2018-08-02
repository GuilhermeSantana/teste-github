package util;

public class Calculadora {

	public static final double PI = 3.14; // Prova de que esse valor não pode mudar

	public static double circuferencia(double raio) {

		return 2.0 * PI * raio;
	}

	public static double volume(double raio) {

		return 4.0 * PI * raio * raio * raio / 3.0;
	}
}
