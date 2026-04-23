package a01;

import java.util.Arrays;

public class A01 {

  // Método genérico <E> que devuelve un array E[]
  static <E> E[] guardar(E elem, E[] tabla) {
    // 1. Creamos una copia de la tabla original con 1 posición extra
    E[] nuevaTabla = Arrays.copyOf(tabla, tabla.length + 1);

    // 2. Insertamos el elemento en la última posición (length - 1)
    nuevaTabla[nuevaTabla.length - 1] = elem;

    // 3. Devolvemos el nuevo array
    return nuevaTabla;
  }

  public static void main(String[] args) {
    
    //Cadena de Strings
    //String[] t1 = new String[0]; // Array vacío
    String[] t1 = {"hola","adios"};
    
    t1 = guardar("coche", t1);
    t1 = guardar("avión", t1);
    
    System.out.println(Arrays.toString(t1)); // Muestra: [coche, avión]

    //Cadena de Enteros
    //Integer[] t2 = new Integer[0]; // Array vacío
    Integer[] t2 = {6,7};
    
    t2 = guardar(4, t2);
    t2 = guardar(5, t2);
    
    System.out.println(Arrays.toString(t2)); // Muestra: [7, 5]
  }
}