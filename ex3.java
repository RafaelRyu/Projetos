package exercise1;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
 int size;

String[] foods;
System.out.println("Quantos alimentos você deseja inserir ?: ");
size = sc.nextInt();
foods = new String[size];
sc.nextLine();

for (int i = 0; i<foods.length; i++) {
	System.out.println("Digite um alimento: ");
	foods[i] = sc.nextLine();
}
System.out.println("Seus alimentos são:");	
for (String food : foods) {
		System.out.println("- "+food);
		
}
		
		
	}

}
