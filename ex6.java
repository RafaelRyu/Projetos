package exercise1;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("**Conversor de Valores em Reais para Notas em Reais**");
		System.out.println("Digite seu valor: ");
			int total = sc.nextInt();
			

			System.out.println(total/100 + " nota(s) de R$ 100,00");
			total = total % 100;

			System.out.println(total/50 + " nota(s) de R$ 50,00");
			total = total % 50;

			System.out.println(total/20 + " nota(s) de R$ 20,00");
			total = total % 20;

			System.out.println(total/10 + " nota(s) de R$ 10,00");
			total =total % 10;

			System.out.println(total/5 + " nota(s) de R$ 5,00");
			total =total % 5;

			System.out.println(total/2 + " nota(s) de R$ 2,00");
			total= total % 2;

			System.out.println(total/1 + " nota(s) de R$ 1,00");
		
		
	}

}
