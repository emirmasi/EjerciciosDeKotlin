package com.practica.ejercicioskotlin.Ejercicios.Cadenas

/*
Se le dan dos matrices a1 y a2 de cadenas. Cada cadena está compuesta por letras de la a a la z. Sea
x cualquier cadena de la primera matriz y y sea cualquier cadena de la segunda matriz.
Encuentre max(abs(longitud(x) − longitud(y)))
Si a1 y/o a2 están vacíos, devuelva -1 en cada idioma excepto en Haskell (F#), donde devolverá Nada
(Ninguno).
Ejemplo:
a1 = ["hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz",
 "qqquuhii", "dvvvwz"]
a2 = ["cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"]
mxdiflg(a1, a2) --> 13
Nota de golpe:
entrada: 2 cadenas con subcadenas separadas por,
salida: número como una cadena
 */

fun mxdiflg(a1:Array<String>, a2:Array<String>):Int {
    // your code
    if(a1.isEmpty() || a2.isEmpty()) return -1
    val maxLgA1 = maxLg(a1)
    val maxLgA2 = maxLg(a2)
    val minLgA1 = minLg(a1)
    val minLgA2 = minLg(a2)

    return if((maxLgA2 - minLgA1) > (maxLgA1 - minLgA2) ) (maxLgA2 - minLgA1) else (maxLgA1 - minLgA2)
}

fun maxLg(matriz : Array<String>): Int{
    var mayor = 0
    for(cadena in matriz){
        if(cadena.length > mayor)
            mayor  = cadena.length
    }
    return mayor
}
fun minLg(matriz : Array<String>) : Int{
    var menor = matriz[0].length
    for(cadena in matriz){
        if(cadena.length < menor)
            menor = cadena.length
    }
    return menor
}