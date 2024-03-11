package com.practica.ejercicioskotlin.Ejercicios.Matematicos

/*Cree una función que tome un número romano como argumento y devuelva su valor como un número entero
decimal. No es necesario validar la forma del número romano.
Los números romanos modernos se escriben expresando cada dígito decimal del número que se va a codificar por separado, comenzando
 con el dígito más a la izquierda y omitiendo los ceros. Así, 1990 se representa como "MCMXC" (1000 = M, 900 = CM, 90 = XC) y 2008
 se representa como "MMVIII" (2000 = MM, 8 = VIII). El número romano de 1666, "MDCLXVI", utiliza cada letra en orden descendente.

 */

fun decode(str : String):Int{
    val tamStr = str.length

    when(tamStr){
        0->return 0
        1-> return symbol(str[0])
        else->{
            var i = tamStr-1
            var result = symbol(str[i])
            var prevValue = result
            i--

            while(i >= 0){
                val act = symbol(str[i])
                if(act < prevValue){
                    result -= act
                }else{
                    result += act
                }
                prevValue = act
                i--
            }
            return result
        }
    }

}
fun symbol(letra:Char): Int {
    val mapDeSymbolos = mapOf(
        'M' to 1000,
        'D' to 500,
        'C' to 100,
        'L' to 50,
        'X' to 10,
        'V' to 5,
        'I' to 1
    )

    return mapDeSymbolos[letra]!!
}

fun encode(num: Int): String{

    val romanNumeralMap = mapOf(
        1000 to "M", 900 to "CM", 500 to "D", 400 to "CD",
        100 to "C", 90 to "XC", 50 to "L", 40 to "XL",
        10 to "X", 9 to "IX", 5 to "V", 4 to "IV", 1 to "I"
    )

    var remainingNumber = num
    var result = ""

    for ((value, symbol) in romanNumeralMap) {
        while (remainingNumber >= value) {
            result += symbol
            remainingNumber -= value
        }
    }

    return result
}