package estrutura.condicional.simples;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int hora;
		
		hora = sc.nextInt();
		
		if(hora >= 6 && hora <= 12) {
		System.out.println("Bom dia");
		}
		else if(hora >= 13 && hora <= 18) {
		System.out.println("Boa tarde");
		}
		else {
		System.out.println("Boa noite");
		}

		sc.close();
		
	}

}
