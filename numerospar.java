package tarea3;

import java.util.Scanner;

public class numerospar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero=0;
		
		System.out.print("Ingrese un n�mero: ");
		Scanner s= new Scanner(System.in);
		numero=s.nextInt();
		
		if (numero%2==0)
			System.out.println("Este n�mero es par");
		else
			System.out.println("Este n�mero es impar");
		
	}

}
