package hesapMakinesi;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Birinci sayıyı giriniz : ");
		int n1 = scanner.nextInt();
		System.out.print("İkinci sayıyı giriniz : ");
		int n2 = scanner.nextInt();

		System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");

		System.out.print("Seçiminiz : ");
		int select = scanner.nextInt();

		switch (select) {
		case 1:
			System.out.println("Toplama : " + (n1 + n2));
			break;
		case 2:
			System.out.println("Çıkarma : " + (n1 - n2));
			break;
		case 3:
			System.out.println("Çarpma : " + (n1 * n2));
			break;
		case 4:
			switch (n2) {
			case 0:
				System.out.println("Bir sayı 0'a bölünemez.");
				break;
			default:
				System.out.println("Bölme : " + (n1 / n2));
			}
			break;
		default:
			System.out.println("Yanlış seçim yaptınız. Tekrar deneyiniz.");
		}

	}
	
}
