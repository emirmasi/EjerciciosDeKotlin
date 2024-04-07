package com.practica.ejercicioskotlin.Ejercicios.Cadenas


/*
Su trabajo es escribir una función que incremente una cadena para crear una nueva cadena.
Si la cadena ya termina con un número, el número debe incrementarse en 1.
Si la cadena no termina en un número. el número 1 debe agregarse a la nueva cadena.
Ejemplos:

foo -> foo1

foobar23 -> foobar24

foo0042 -> foo0043

foo9 -> foo10

foo099 -> foo100

Atención: Si el número tiene ceros a la izquierda se debe considerar la cantidad de dígitos.
 */
fun incrementString(str: String) : String {

    val texto = str.split(Regex("[^\\d]+"))
    val string = texto[0]
    val cantDigitos = texto[1].length

    return if(cantDigitos == 0)
         string + "1"
    else{
        /////tengo que verificar los 0 a a las izquierda
        val numeroIncrementado = texto[1].toInt() + 1 ///cuando lo pasamos a int los ceros desaparece ej 0001 = 1
        var numeroStr = ""
        if(numeroIncrementado.toString().length < cantDigitos){
            val cantDeCerosAAgregar = numeroIncrementado.toString().length - cantDigitos
            for (i in 1..cantDeCerosAAgregar){
                numeroStr += "0"
            }

        }
        numeroStr += numeroIncrementado.toString()
        string + numeroStr
    }
}