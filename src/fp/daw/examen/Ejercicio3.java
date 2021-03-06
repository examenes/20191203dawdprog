package fp.daw.examen;

import java.util.Scanner;

public class Ejercicio3 {

	/* 3 puntos
	 * 
	 * Decimos que un número entero positivo es guay si puede obtenerse como suma de dos o más números
	 * enteros consecutivos. Por ejemplo, 3 (=1+2), 5 (=2+3), 6(=1+2+3), son números guays.
	 * 
	 * Escribir en el método main un programa que lea un número entero positivo e indique si éste es guay.
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		do {
			System.out.print("Número entero positivo: ");
			n = in.nextInt();
			if (n < 0)
				System.out.println("Número incorrecto, inténtalo de nuevo.");
		} while (n < 0);
		
		int i = 1, j = 0, n2 = n / 2;
		boolean esGuay = false;
		while (i <= n2 && !esGuay) {
			int suma = 0;
			j = i;
			while (j < n && !esGuay) {
				suma += j;
				if (suma == n)
					esGuay = true;
				else
					j++;
			}
			if (!esGuay)
				i++;
		}
		System.out.print(String.valueOf(n));
		if (esGuay) {
			System.out.print(" = ");
			for (int k=i; k<=j; k++) {
				System.out.print(String.valueOf(k));
				if (k < j)
					System.out.print(" + ");
			}
		}
		else
			System.out.print(" no");
		System.out.println(" es guay");
		in.close();
	}

}
