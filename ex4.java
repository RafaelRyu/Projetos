import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int senha;
         senha = sc.nextInt();
        
        while(senha != 2002) {
        	System.out.println("Senha Invalida");
        	 senha = sc.nextInt();
        }
        System.out.println("Acesso Permitido");
	}

}
