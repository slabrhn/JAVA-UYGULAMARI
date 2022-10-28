package fibonacci;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Eleman sayısı : ");
		int n = scanner.nextInt();
		
		int number1 = 1; 
		int number2 = 1;
		int number3;
		
		System.out.print(number1 + " - " + number2);
		
		for(int i = 0; i < n; i++) {
			number3 = number1 + number2;
			number1 = number2;
			number2 = number3;
			System.out.print(" - " + number3);
		}

	}

}
