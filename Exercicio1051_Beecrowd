package exercise1;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		
		
		double imposto=0, salario, dif, total_imposto;
		System.out.println("f");
		salario = scan.nextDouble();
		
		if (salario > 4500.00) {

			imposto = (1000*0.08)+(1500.00*0.18);

			dif = (salario-4500.00)*0.28;

			total_imposto = imposto + dif;
			
			System.out.printf("R$ %.2f\n", total_imposto);

			}

			else if (salario > 3000.01 && salario <=4500.00) {

			imposto = (1000*0.08);

			dif = (salario-3000.00)*0.18;

			total_imposto= imposto + dif;
			
			System.out.printf("R$ %.2f\n", total_imposto);

			}

			else if (salario > 2000.01 && salario <=3000.00) {

			dif = (salario-2000.00)*0.08;

			total_imposto= dif;
			System.out.printf("R$ %.2f\n", total_imposto);

			}

			else {

			System.out.println("Isento");

			}

			scan.close();
		
		
		
		
	}

}
