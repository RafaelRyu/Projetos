import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		int hora = sc.nextInt();
		int vel_med = sc.nextInt();
		double dist = vel_med*hora;
		 double gaso = dist/12;
		 System.out.printf("%.3f", gaso);
	}

}
