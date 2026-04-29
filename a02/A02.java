package a02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class A02 {

    public static void main(String[] args) {
        Collection<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un entero no negativo (-1 para terminar): ");
        int n = sc.nextInt();

        while (n != -1) {
            if (n >= 0) {
                numeros.add(n);
            } else {
                System.out.println("Por favor, números no negativos.");
            }
            System.out.print("Introduce un entero no negativo (-1 para terminar): ");
            n = sc.nextInt();
        }

        System.out.println("\nLista completa: " + numeros);

        System.out.print("Valores pares: ");
        for (Integer num : numeros) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println(); // Salto de línea

        // Eliminación segura de los múltiplos de 3
        Iterator<Integer> it = numeros.iterator();
        while (it.hasNext()) {
            int actual = it.next();
            if (actual % 3 == 0) {
                it.remove();
            }
        }

        System.out.println("Sin múltiplos de 3: " + numeros);
        sc.close();
    }
}
