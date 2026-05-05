package a05;

import java.util.ArrayList;
import java.util.Collection;

public class A05 {

    public static void main(String[] args) {
        Collection<Integer> lista = new ArrayList<>();

        // Insertamos 100 números aleatorios
        for (int i = 0; i < 100; i++) {
            lista.add((int) (Math.random() * 10 + 1));
        }
        System.out.println("Original: " + lista);

        // Creamos una colección auxiliar solo con el número 5
        Collection<Integer> coleccionCincos = new ArrayList<>();
        coleccionCincos.add(5);

        // Eliminamos de 'lista' todo lo que esté en 'coleccionCincos'
        lista.removeAll(coleccionCincos);

        System.out.println("Sin cincos: " + lista);
    }
}
