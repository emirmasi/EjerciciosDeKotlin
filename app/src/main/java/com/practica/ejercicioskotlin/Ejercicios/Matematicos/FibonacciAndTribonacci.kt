package com.practica.ejercicioskotlin.Ejercicios.Matematicos

import kotlin.system.measureTimeMillis

/*
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */
fun finobacci(){
    var n0 = 0
    var n1 = 1
    for (i in 0..50){
        print(n0)
        val fib = n0+n1
        n0 = n1
        n1 = fib
    }
}

/*
Bien, me encontré con el hermano mayor de Fibonacci, también conocido como Tribonacci.
Como su nombre ya puede revelar, funciona básicamente como un Fibonacci, pero sumando los últimos 3
(en lugar de 2) números de la secuencia para generar la siguiente. Y, lo peor de toda, lamentablemente
no podré escuchar a hablantes de italiano no nativos intentando pronunciarlo :(
Entonces, si vamos a comenzar nuestra secuencia de Tribonacci con [1, 1, 1] como entrada inicial
(también conocida como firma), tenemos esta secuencia:
[1, 1, 1, 3, 5, 9, 17, 31, ...]
Pero ¿qué pasaría si empezáramos con [0, 0, 1] como firma? Como comenzar con [0, 1] en lugar de [1, 1]
básicamente desplaza la secuencia común de Fibonacci un lugar, puedes sentirte tentado a pensar que
obtendríamos la misma secuencia desplazada 2 lugares, pero ese no es el caso y obtendríamos:
[0, 0, 1, 1, 2, 4, 7, 13, 24,...]
Bueno, es posible que ya lo hayas adivinado, pero para que quede claro: necesitas crear una
función de Fibonacci que, dada una matriz/lista de firmas, devuelva los primeros n elementos,
incluida la firma, de la secuencia sembrada.
La firma siempre contendrá 3 números; n siempre será un número no negativo; si n == 0,
entonces devuelve una matriz vacía (excepto en C que devuelve NULL) y prepárate para cualquier
otra cosa que no esté claramente especificada;)
Si disfrutaste este kata, puedes encontrar una versión más avanzada y generalizada en el kata Xbonacci.
[Agradecimiento personal al profesor Jim Fowler en Coursera por sus increíbles clases que
realmente recomiendo a cualquier entusiasta de las matemáticas y por mostrarme también esta
curiosidad matemática con su habitual pasión contagiosa :)]
 */

fun tribonacci(signature: DoubleArray, n: Int): DoubleArray {
    // Your code here
    if(n == 0) return doubleArrayOf()

    if(n <= signature.size){
        var nuevoArray = DoubleArray(n)
        for (i in 0 until minOf(signature.size,n)) {
            nuevoArray[i] = signature[i]
        }
        return nuevoArray
    }
///lo puedo mejorar este ejercicio
    val result : DoubleArray = DoubleArray(n)
    ///aca ya el resultado tiene la firma
    result[0] = signature[0]
    result[1] = signature[1]
    result[2] = signature[2]
    var i = n - signature.size
    var j = 0
    while ( i > 0){
        val fib  = result[j] + result[j+1] + result[j+2]
        result[j+3] = fib
        j++
        i--
    }
    return result
}
fun tribonacciOptimizado(signature: DoubleArray,n : Int): DoubleArray{
    var result = DoubleArray(n)

    return  when(n){
        0-> return doubleArrayOf()
        1,2->{
            ///aca tengo que reducir tamaño
            if(n == 1){
                doubleArrayOf(signature[n-1])
            }else{
                doubleArrayOf(signature[0],signature[1])
            }
        }
        3-> signature
        else->{
            result[0] = signature[0]
            result[1] = signature[1]
            result[2] = signature[2]
            var j = 0
            for(i in 3 until n){
                val fib = result[j] + result[j+1] + result[j+2]
                result[i] = fib
                j++
            }
            result
        }
    }
}
///calculamos la optimizacion
fun main(){
    ///
    val tribonaccioComun = measureTimeMillis { tribonacci(doubleArrayOf(0.0,1.0,1.0),5) }

    val tribonaccioOptimizado = measureTimeMillis { tribonacci(doubleArrayOf(0.0,1.0,1.0),5) }

    println("tribonacci comun: $tribonaccioComun")
    println("tribonacci optimizado: $tribonaccioOptimizado")
}