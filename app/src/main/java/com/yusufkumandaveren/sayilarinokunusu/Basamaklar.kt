package com.yusufkumandaveren.sayilarinokunusu

class Basamaklar {

    fun yeni(sayimiz:Int):String{

        var birler = arrayOf("","Bir","İki","Üç","Dört","Beş","Altı","Yedi","Sekiz","Dokuz")
        var onlar = arrayOf("","On","Yirmi","Otuz","Kırk","Elli","Altmış","Yetmiş","Seksen","Doksan")

        if (sayimiz<10){
            return "${birler[sayimiz]}"
        }else if (sayimiz<100){
            var bir = sayimiz%10
            var on = sayimiz/10
            return "${onlar[on]+" "+birler[bir]}"
        }
        return "Geçersiz sayı"
    }
}