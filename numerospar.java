package tarea3;

import java.util.Scanner;

public class numerospar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero=0;
		
		System.out.print("Ingrese un número: ");
		Scanner s= new Scanner(System.in);
		numero=s.nextInt();
		
		if (numero%2==0)
			System.out.println("Este número es par");
		else
			System.out.println("Este número es impar");
		
	}

}
