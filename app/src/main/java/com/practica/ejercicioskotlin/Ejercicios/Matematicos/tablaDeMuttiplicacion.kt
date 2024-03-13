package com.practica.ejercicioskotlin.Ejercicios.Matematicos

import kotlin.system.measureTimeMillis

/*
Su tarea es crear una tabla de multiplicar N × N, del tamaño proporcionado en el parámetro.
Por ejemplo, cuando el tamaño dado es 3:

1 2 3
2 4 6
3 6 9
Para el ejemplo dado, el valor de retorno debe ser:

[[1,2,3],[2,4,6],[3,6,9]]
 */
object KataSolution {
    fun multiplicationTable(size: Int): Array<IntArray> {
        var result = Array(size){IntArray(size){0} }
        ///inicializamos la matriz de un tamaño size x size
        for(i in 0 until size){
            for(j in 0 until size){
                result[i][j] = (i+1)*(j+1)
            }
        }
        return result
    }
}
///optimizado
fun multiplicationTableOptimizado(size: Int): Array<IntArray>  =
    Array(size){x-> IntArray(size) {y-> (x+1)*(y+1)} }

fun main(){
    val tablaDeMultiplicacionComun = measureTimeMillis { KataSolution.multiplicationTable(5) }

    val tablaDeMultiplicacionOptimizado = measureTimeMillis { multiplicationTableOptimizado(5) }

    println("tiempo comun : $tablaDeMultiplicacionComun ms")
    println("tiempo optimizado: $tablaDeMultiplicacionOptimizado ms")
}