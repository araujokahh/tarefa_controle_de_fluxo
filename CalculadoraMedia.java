package ContFluxo;

import java.util.Scanner;


public class CalculadoraMedia {
	static float totalnotas;
	
	
	public static void main(String[] args) {
		calculoMedia();
		condicional();	
	}
	
	
	public static void calculoMedia() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite suas notas: ");
		int nota1 = s.nextInt();
		int nota2 = s.nextInt();
		int nota3 = s.nextInt();
		int nota4 = s.nextInt();
		
		System.out.println("Suas notas são: " + nota1 + ", " + nota2 + ", " + nota3 + ", " + nota4);

		totalnotas = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("A sua média é: " + totalnotas);
	
	}

	
	public static void condicional() {
		if (totalnotas>= 7){
			System.out.println("Parabéns, sua média é " + totalnotas + ", você está APROVADO(a)!");
		}
			else if (totalnotas >= 5 && totalnotas <7){
				System.out.println("Sua média é " + totalnotas + ", você está RECUPERAÇÃO!");
				
			}
			else {
				System.out.println("Sua média é " + totalnotas + ", você está REPROVADO!");
				
			}
				
	}

}