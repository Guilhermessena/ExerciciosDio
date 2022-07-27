package one.digitalinnovationone.exercicio;

import java.util.*;

public class Exercicio {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int casos = input.nextInt();

		int cont = 0;
		double somaA = 0;
		double somaB = 0;
		double somaC = 0;
		double somaD = 0;
		double somaE = 0;
		double mediaA;
		double mediaB;
		double mediaC;
		double mediaD;
		double mediaE;
		double pesoA1 = 0;
		double pesoA2 = 0;
		double pesoA3 = 0;
		double pesoB1 = 0;
		double pesoB2 = 0;
		double pesoB3 = 0;
		double pesoC1 = 0;
		double pesoC2 = 0;
		double pesoC3 = 0;
		double pesoD1 = 0;
		double pesoD2 = 0;
		double pesoD3 = 0;
		double pesoE1 = 0;
		double pesoE2 = 0;
		double pesoE3 = 0;

		while (cont < casos) {

			double a = input.nextDouble();
			if (cont == 0) {
				pesoA1 = a * 2;
			} else if (cont == 1) {
				pesoA2 = a * 3;
			} else if (cont == 2) {
				pesoA3 = a * 5;
			}
			somaA = pesoA1 + pesoA2 + pesoA3;
			cont++;
		}

		cont = 0;

		while (cont < casos) {

			double b = input.nextDouble();
			if (cont == 0) {
				pesoB1 = b * 2;
			} else if (cont == 1) {
				pesoB2 = b * 3;
			} else if (cont == 2) {
				pesoB3 = b * 5;
			}
			somaB = pesoB1 + pesoB2 + pesoB3;
			cont++;
		}

		cont = 0;

		while (cont < casos) {

			double c = input.nextDouble();
			if (cont == 0) {
				pesoC1 = c * 2;
			} else if (cont == 1) {
				pesoC2 = c * 3;
			} else if (cont == 2) {
				pesoC3 = c * 5;
			}
			somaC = pesoC1 + pesoC2 + pesoC3;
			cont++;
		}
		
		cont = 0;

		while (cont < casos) {

			double d = input.nextDouble();
			if (cont == 0) {
				pesoD1 = d * 2;
			} else if (cont == 1) {
				pesoD2 = d * 3;
			} else if (cont == 2) {
				pesoD3 = d * 5;
			}
			somaD = pesoD1 + pesoD2 + pesoD3;
			cont++;
		}
		
		cont = 0;

		while (cont < casos) {

			double e = input.nextDouble();
			if (cont == 0) {
				pesoE1 = e * 2;
			} else if (cont == 1) {
				pesoE2 = e * 3;
			} else if (cont == 2) {
				pesoE3 = e * 5;
			}
			somaE = pesoE1 + pesoE2 + pesoE3;
			cont++;
		}

		mediaA = somaA / 10;
		mediaB = somaB / 10;
		mediaC = somaC / 10;
		mediaD = somaD / 10;
		mediaE = somaE / 10;

		System.out.printf("%.1f \n", mediaA);
		System.out.printf("%.1f \n", mediaB);
		System.out.printf("%.1f \n", mediaC);
		System.out.printf("%.1f \n", mediaD);
		System.out.printf("%.1f \n", mediaE);

	}

}
