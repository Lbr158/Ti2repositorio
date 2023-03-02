package Inicio;
import java.util.*;

 class somar2 {
	 public static Scanner sc = new Scanner(System.in);
	 public static void main(String args[]) {
		 //Declaracao de variaveis
		 int num1,num2,soma;
		 
		 //leituras
		 System.out.print("digite um numero");
		 num1 = sc.nextInt();
		 System.out.print("digite outro numero");
		 num2 = sc.nextInt();
		 
		 //somar
		 soma = num1 + num2;
		 
		 //mostrar na tela
		 
		 System.out.println("soma:" + soma);
	 }
}
