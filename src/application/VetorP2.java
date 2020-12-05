/**
 * Fazer um programa para ler um n�mero inteiro N
 * e os dados (nome e pre�o) de N Produtos em um vetor
 * Em segudida, mostar o pre�o m�dio dos produtos
 */

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class VetorP2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		double sum = 0.0;
		
		for (int i = 0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
			sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		sc.close();

	}

}
