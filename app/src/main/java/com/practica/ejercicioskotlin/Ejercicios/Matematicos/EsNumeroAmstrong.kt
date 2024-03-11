package com.practica.ejercicioskotlin.Ejercicios.Matematicos

import com.practica.habitos.Ejercicios.cantidadDeDigitos

fun esNumeroAmstrong(num: Int):Boolean{
    ///tengo que buscar la cantidad de digitos
    /// si divido por 10 el numero el resto me queda para buscar el exponente
    val cantDigitos : Int =  cantidadDeDigitos(num)
    var cociente :Int = num
    var acum  = 0
    while (cociente != 0){
        val resto = cociente % 10
        acum+= exponente(resto,cantDigitos)
        cociente /= 10
    }
    return acum == num
}

fun exponente(resto: Int, cantDigitos: Int): Int {
    return 0
}