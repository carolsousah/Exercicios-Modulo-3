package com.example.exerciciosm3

class When {
}

fun main() {
    var ParImpar: String
    var numero = 5

    ParImpar = when{
        (numero %2==0) -> println("O numero é par").toString()
        else -> println("O numero é impar").toString()
    }

}