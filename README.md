# 📚 Unidad 10: Colecciones en Java - Soluciones

¡Hola de nuevo, estudiantes! 👋 

Bienvenidos al repositorio con las **soluciones a las actividades de la Unidad 10**. 

En este tema damos un salto cualitativo enorme. Vamos a dejar atrás las limitaciones de los arrays clásicos (tablas de tamaño fijo) para adentrarnos en el **Collections Framework** de Java. Aprenderemos a utilizar estructuras dinámicas que crecen y decrecen solas, y descubriremos que elegir la estructura de datos adecuada es la mitad del trabajo de un buen programador.

---

## 🎯 ¿Qué conceptos ponemos en práctica aquí?

En estos ejercicios trabajaremos con la arquitectura unificada que nos proporciona el paquete `java.util`:

*   💎 **Tipos genéricos (`<T>`)**: Uso del operador diamante para crear colecciones "seguras" (*type safety*) y evitar la excepción `ClassCastException`.
*   📦 **El framework `Collection`**: Métodos comunes para todas las colecciones (`add`, `remove`, iteradores) y métodos globales (`addAll`, `retainAll`).
*   📜 **Listas (`List`)**: Colecciones que mantienen el orden de inserción, permiten duplicados y ofrecen acceso posicional por índice (usaremos principalmente `ArrayList`).
*   🚫 **Conjuntos (`Set`)**: Colecciones matemáticas que **no permiten duplicados**. Jugaremos con `HashSet` (rápido, sin orden), `LinkedHashSet` (orden de inserción) y `TreeSet` (orden natural).
*   🗺️ **Mapas o diccionarios (`Map`)**: Estructuras basadas en pares de **Clave-Valor**. Veremos cómo recuperar valores a través de sus claves únicas y cómo iterar sobre sus vistas (`keySet()`).
*   🧰 **La clase `Collections`**: Nuestra nueva caja de herramientas llena de métodos estáticos para ordenar (`sort`), barajar (`shuffle`), buscar (`binarySearch`) o encontrar extremos (`max`, `min`).

---

## 🚀 Índice de actividades

A continuación, tenéis el resumen de las actividades realizadas en esta unidad:

| Ejercicio | Temática | Conceptos clave trabajados |
| :---: | :--- | :--- |
| **1** | 🧬 **Métodos genéricos** | Implementación de un método `guardar` capaz de recibir un elemento y un array genérico para devolver una nueva tabla redimensionada. |
| **2 al 6** | 🏗️ **Framework `Collection`** | Inserción básica, uso seguro de `Iterator` para evitar "javazos" al borrar en bucles, métodos de conjuntos globales y conversiones útiles entre tablas y colecciones (`Arrays.asList`). |
| **7 y 8** | 📜 **Listas (`List`)** | Manipulación por índices (cuidado con la trampa del método `remove` en listas de enteros) y algoritmos de comparación y ordenación alfabética. |
| **9 y 10** | 🚫 **Conjuntos (`Set`)** | Eliminación de duplicados convirtiendo listas a `HashSet`. Comprobación de ordenaciones nativas con `TreeSet` y gestión de una clase `Socio` implementando `Comparable`. |
| **11** | 🗺️ **Mapas (`Map`)** | Creación de un sistema de gestión de stock de repuestos. Uso de códigos como *Clave* y unidades como *Valor*. Menú interactivo de altas, bajas y actualizaciones. |
| **12** | 🧰 **Clase `Collections`** | Análisis de una lista de premios: extracción de máximos, mínimos, cálculo de frecuencias, barajado aleatorio y búsquedas binarias ultrarrápidas. |

---

## 🛠️ ¿Cómo usar este repositorio?

1. **La interfaz manda:** Fijaos siempre en cómo instanciamos los objetos en las soluciones. Siempre usamos la interfaz a la izquierda y la implementación a la derecha (ej. `List<String> nombres = new ArrayList<>();`). Esto es polimorfismo puro.
2. **Entiende el método `equals()`:** En las actividades de conjuntos (como la de los Socios), revisad bien cómo hemos sobrescrito el método `equals()`. Es la única forma que tiene Java de saber si un objeto está duplicado o no.
3. **Cuidado con los recorridos:** Intentad modificar una colección dentro de un bucle `for-each` clásico para ver cómo el programa falla. Luego, mirad la solución con el `Iterator` para entender cómo se hace de forma segura.

> **💡 Consejo del profe:** 
> *Un buen desarrollador no programa siempre con `ArrayList` por costumbre. Si necesitáis buscar elementos constantemente sin importar el orden, usad un `HashSet`. Si necesitáis asociar identificadores a objetos, usad un `HashMap`. Conocer vuestras herramientas os hará programar mucho más rápido y mejor.*

---
*Profe: Javier Torre Antúnez | IES Newton-Salas* 🏫