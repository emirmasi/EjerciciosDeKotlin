package com.practica.habitos.Ejercicios


/*
 * Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */
fun esPrimo(num:Int):Boolean{
    if(num < 2)///los numeros primos son solo numeros naturales
        return false

    for(i in 2..(num-1)){
        if(num % i == 0 )///si la division de numeros a partir de 2 hasta num-1 da 0 significa que es divisor y por lo tanto no es primo
            return false
    }
    return true
}

/*
 * Escribe una función que calcule si un número dado es un número de Armstrong
 * (o también llamado narcisista).
 * Si no conoces qué es un número de Armstrong, debes buscar información
 * al respecto.
 */



fun cantidadDeDigitos(num: Int): Int {
    var cantDigitos = 0
    var resultado :Int = num
    while (resultado != 0){
        cantDigitos++
        resultado /= 10
    }
    return cantDigitos
}

/*Dado un conjunto de números, devuelve el inverso aditivo de cada uno.
Todo lo positivo se vuelve negativo y lo negativo se vuelve positivo.

invertir([1,2,3,4,5]) == [-1,-2,-3,-4,-5]
invertir([1,-2,3,-4,5]) == [-1,2,-3,4,-5]
invertir([]) == []
 */
fun invertirNumeros(arr: IntArray) : IntArray {
    ///debo recorrer cada array y multiplicarlo x-1
    var arrayInvertido = IntArray(arr.size)

     arr.forEachIndexed { index, value ->
        arrayInvertido[index] = value*-1
    }
    return arrayInvertido
}

