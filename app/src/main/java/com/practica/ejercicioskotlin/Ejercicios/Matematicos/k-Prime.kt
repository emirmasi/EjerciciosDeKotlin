package com.practica.ejercicioskotlin.Ejercicios.Matematicos

/*
Un número natural se llama k-primo si tiene exactamente k factores primos, contados con multiplicidad.
Por tanto, un número natural es primo si y sólo si es 1-primo.
Ejemplos de k-primos:
k = 2 -> 4, 6, 9, 10, 14, 15, 21, 22,…
k = 3 -> 8, 12, 18, 20, 27, 28, 30,…
k = 5 -> 32, 48, 72, 80, 108, 112,…
Los números k-primos no están espaciados regularmente. Por ejemplo: entre 2 y 50 tenemos los
siguientes 2 primos:
[4, 6, 9, 10, 14, 15, 21, 22, 25, 26, 33, 34, 35, 38, 39, 46, 49]
Los pasos entre dos k-primos de esta lista son 2, 3, 1, 4, 1, 6, 1, 3, 1, 7, 1, 1, 3, 1, 7, 3.
Tarea
Escribiremos una función kprimes_step(k, paso, inicio, nd) con parámetros:
k (entero > 0) que indica el tipo de k-primos que estamos buscando,
paso (entero > 0) que indica el paso que queremos encontrar entre dos k-primos,
inicio (entero >= 0) que da el inicio de la búsqueda (inicio inclusive),
nd (entero >= inicio) que da el final de la búsqueda (nd inclusive)
En el ejemplo anterior, kprimes_step(2, 2, 0, 50) devolverá [[4, 6], [33, 35]] que son los pares de 2 primos
entre 2 y 50 con 2 pasos.
Entonces, esta función debería devolver una matriz de todos los pares (o tuplas) de k números primos
espaciados con un paso entre los límites inicio, nd. Esta matriz puede estar vacía.
Nota (rápida)
Cuando no hay ningún par, en lugar de devolver una matriz vacía, devuelve nil
kprimes_step(5, 20, 0, 50) => nulo
Ejemplos:
kprimes_step(2, 2, 0, 50) => [[4, 6], [33, 35]]
kprimes_step(6, 14, 2113665, 2113889) => [[2113722, 2113736]])
kprimes_step(2, 10, 0, 50) => [[4, 14], [15, 25], [25, 35], [39, 49]]
kprimes_step(5, 20, 0, 50) => []
 */

