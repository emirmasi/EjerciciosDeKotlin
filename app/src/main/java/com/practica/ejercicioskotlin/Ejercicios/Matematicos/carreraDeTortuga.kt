package com.practica.ejercicioskotlin.Ejercicios.Matematicos

/*
Dos tortugas llamadas A y B deben correr una carrera. A comienza con una velocidad promedio de 720 pies
por hora. La joven B sabe que corre más rápido que A y, además, no se ha terminado el repollo.
Cuando finalmente comienza, puede ver que A tiene una ventaja de 70 pies pero la velocidad de B es de 850 pies
por hora. ¿Cuánto tiempo le tomará a B atrapar a A?
De manera más general: dadas dos velocidades v1 (velocidad de A, entero > 0) y v2 (velocidad de B, entero > 0)
y una ventaja g (entero > 0), ¿cuánto tiempo le tomará a B atrapar a A?
El resultado será una matriz [hora, min, seg] que es el tiempo necesario en horas, minutos y segundos
(redondeando al segundo más cercano) o una cadena en algunos idiomas.
Si v1 >= v2 entonces devuelve nil, nada, nulo, Ninguno o {-1, -1, -1} para C++, C, Go, Nim, Pascal, COBOL,
 Erlang, [-1, -1, -1] para Perl,[] para Kotlin o "-1 -1 -1" para otros.
Ejemplos:
(la forma del resultado depende del idioma)
carrera(720, 850, 70) => [0, 32, 18] o "0 32 18"
carrera(80, 91, 37) => [3, 21, 49] o "3 21 49"
Nota:
Vea otros ejemplos en "Sus casos de prueba".
En Fortran, como en cualquier otro idioma, la cadena devuelta no puede contener ningún espacio en blanco
final redundante: puede usar cadenas de caracteres asignadas dinámicamente.
** Consejos para personas que no saben cómo convertir a horas, minutos y segundos:
A las tortugas no les importan las fracciones de segundo
Piense en el cálculo a mano usando solo números enteros (en su código use o simule la división de enteros)
o Google: "convertir tiempo decimal a horas minutos segundos"
 */

fun race(v1:Int, v2:Int, g:Int):IntArray {
    // your code

    if(v1>=v2) {
        return intArrayOf()
    }

    val segundos = (g.toDouble()/(v2-v1))*3600
    val hora= (segundos / 3600).toInt()
    val minutos = ((segundos % 3600)/60).toInt()
    val segundosRestantes = (segundos % 60).toInt()

    return intArrayOf(hora,minutos,segundosRestantes)
}

fun main(){
    val result = race(720,850,70)
}