import java.util.*;

class SomarDois {
	public static void main (String args[]){
		//Declaracao de variaveis
		Scanner sc = new Scanner(System.in);
		int num1, num2, soma;
		//Leituras
		System.out.println("Digite um número");
		num1 = sc.nextInt();
		System.out.println("Digite outro número");
		num2 = sc.nextInt();
		//Somar
		soma = num1 + num2;
		//Mostrar na tela
		System.out.println("Soma:" + soma);
		sc.close();
		}
}