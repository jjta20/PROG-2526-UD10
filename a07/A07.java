package a07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A07 {

    public static void main(String[] args) {
        
        // 1 y 2. Inicialización
        List<Integer> lista1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        List<Integer> lista2 = new ArrayList<>(Arrays.asList(99, 99));

        // 3. Inserción simple en índice 0
        lista1.add(0, 5); // [5, 10, 20, 30, 40]

        // 4. Inserción múltiple en índice 2
        lista1.addAll(2, lista2); // [5, 10, 99, 99, 20, 30, 40]

        // 5. Lectura con get()
        System.out.println("En el índice 4 está el: " + lista1.get(4)); // Muestra 20

        // 6. Sustitución con set() del último elemento
        int ultimoIndice = lista1.size() - 1;
        Integer sustituido = lista1.set(ultimoIndice, 500);
        System.out.println("Se ha sustituido el: " + sustituido); // Muestra 40

        // 7. Borrar por índice (Borra el 10)
        lista1.remove(1);

        // 8. Borrar por objeto (Borra el primer 99)
        lista1.remove(Integer.valueOf(99));

        // 9. Mostrar lista final
        System.out.println("Lista final: " + lista1);
        // Resultado esperado: [5, 99, 20, 30, 500]
    }
}
