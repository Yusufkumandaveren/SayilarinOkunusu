package com.yusufkumandaveren.sayilarinokunusu

fun main(){

    print("Bir sayı girin: ")
    val sayimiz = readLine()?.toIntOrNull()
    var basamak = Basamaklar()
    if (sayimiz != null) {
        val okunanSayi = basamak.yeni(sayimiz)
        println("Girilen Sayının Okunuşu: $okunanSayi")
    } else {
        println("Geçersiz bir sayı girdiniz.")
    }

}