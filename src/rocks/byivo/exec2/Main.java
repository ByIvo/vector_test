package rocks.byivo.exec2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArraySum arraySum = Main.requestNewArraySum(scanner);
		Main.showArraySum(scanner, arraySum);
	}

	private static ArraySum requestNewArraySum(Scanner scanner) {
		ArraySum arraySum = null;
		
		System.out.println("\nInforme um múltiplo de 10 entre 10 e 1000!");
		int userInput = scanner.nextInt();
		
		try {
			arraySum = new ArraySum(userInput);
		} catch (InvalidInput | OutOfRange e) {
			System.out.println("--------------------------------------------\n");
			System.err.println(e.getMessage());
			return Main.requestNewArraySum(scanner);
		}

		return arraySum;
	}
	
	private static void showArraySum(Scanner scanner, ArraySum arraySum) {
		System.out.println("Array criado e preenchido! Digite: \n1 para somar os ímpares;\n2 para somar os pares;\n0 para sair e nunca mais voltar!");
		int userInput = scanner.nextInt();
		
		switch (userInput) {
		case 1:
			System.out.println(String.format("A soma dos números ímpares é %1$d", arraySum.sumOdds()));
			break;
			
		case 2:
			System.out.println(String.format("A soma dos números pares é %1$d", arraySum.sumEvens()));
			break;
		
		case 0:
			break;
			
		default:
			System.err.println("\nOpção inexistente! Tente novamente");
			Main.showArraySum(scanner, arraySum);
			break;
		}
	}
}
