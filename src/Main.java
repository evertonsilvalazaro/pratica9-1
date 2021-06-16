import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numerador, denominador;
		int result;

		try {
			System.out.println("Digite um numero ");
			numerador = sc.nextInt();

			System.out.println("Digite o segundo numero ");
			denominador = sc.nextInt();

			result = numerador / denominador;

			System.out.println("O resultado da divisão é " + result);

		} catch (ArithmeticException a) {
			System.out.println(" não é divisível por 0");
		}
	}
}
