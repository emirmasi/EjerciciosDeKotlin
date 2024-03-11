package com.practica.ejercicioskotlin.Ejercicios.Matematicos

/*
* Crea un programa se encargue de transformar un número
* decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
*/
fun convertirABinario(numero:Int):Long{
    var numeroBinario = ""
    var residuo :Int
    var cociente:Int = numero
    while (cociente != 0){
        residuo = cociente%2
        cociente /= 2
        numeroBinario += if(residuo != 0){
            "1"
        }else{
            "0"
        }
    }
    return numeroBinario.reversed().toLong()
}