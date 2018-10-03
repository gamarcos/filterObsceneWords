package com.marcos.gabriel.filterobscenewords.modules

import android.content.Context

/**
 * Created by Gabriel Marcos on 03/10/2018.
 */
class ObsceneWords{

    companion object {
        val obsceneWordsList = arrayListOf(
                "abestado", "anus", "ânus", "babaca", "babaovo", "baba-ovo", "bacura", "bagos", "baitinga", "baitola", "baranga", "baranga", "bebum", "besta", "bicha", "bisca", "bixa", "bla", "blá", "bla bla bla", "blá blá blá", "blefando", "blefe", "boazuda", "boceta", "boco", "bocó", "boiola", "bolagato", "bolcat", "boquete", "bosseta", "bosta", "bostana", "bostas", "brecha", "brexa", "brioco", "brocha", "bronha", "broxa", "buca", "buceta", "bunda", "bunduda", "bura", "burro", "busseta", "cabeça chata", "cachorra", "cachorro", "cadeia", "cadela", "caga", "cagado", "cagao", "cagão", "cagona", "canalha", "cara de pau", "caralho", "carniça", "casseta", "cassete", "charlatanismo", "charlatao", "charlatão", "chatice", "chato", "chato demais", "checheca", "chereca", "chibumba", "chibumbo", "chifruda", "chifrudo", "chochota", "chota", "chupada", "chupado", "clitoris", "clitóris", "cocaina", "cocaína", "coco", "cocô", "conversa fiada", "corna", "corno", "cornuda", "cornudo", "cretina", "cretino", "cu", "cú", "cu", "culhao", "culhão", "culhões", "curalho", "cuzao", "cuzão", "cuzuda", "cuzudo", "debil", "debiloide", "defunto", "demonio", "demônio", "desanima", "desanimei", "desgracado", "desgraçado", "desgracados", "desgraçados", "desisti", "difunto", "dinheiro de volta", "doida", "doido", "egua", "égua", "embromation", "enganação", "enganando", "enganosa", "enrola demais", "enrolação", "enrolão", "escrota", "escroto", "espertinho", "esporrada", "esporrado", "esporro", "estelionatario", "estelionatário", "estelionato", "estupida", "estúpida", "estupidez", "estupido", "estúpido", "fake", "fala demais", "fala fala", "fdp", "fedida", "fedido", "fedor", "fedorenta", "feia", "feio", "feiosa", "feioso", "feioza", "feiozo", "fela", "felacao", "felação", "fenda", "fiada", "filho da puta", "fim do vídeo", "fiofó", "foda", "fodao", "fodão", "fode", "fodida", "fodido", "fornica", "fraude", "fudecao", "fudeção", "fudendo", "fudida", "fudido", "fulera", "fuleragem", "furada", "furao", "furão", "furnica", "furnicar", "gay", "golpe", "golpista", "gonorrea", "gonorreia", "gosmenta", "gosmento", "grelinho", "grelo", "homosexual", "homo-sexual", "homossexual", "idiota", "idiotas", "idiotice", "imbecil", "inferno", "iscrota", "iscroto", "kenga", "ladra", "ladrao", "ladrão", "ladroeira", "ladrona", "lalau", "leprosa", "leproso", "lesbica", "lésbica", "linguiça", "lorota", "ludibriacao", "ludibriação", "ludibriar", "macaca", "macaco", "machona", "machorra", "malandragem", "malandro", "manguaca", "manguaça", "masturba", "meleca", "merda", "mija", "mijada", "mijado", "mijo", "miserável", "mocrea", "mocréa", "mocreia", "mocréia", "moleca", "moleque", "mondronga", "mondrongo", "muita conversa", "muito longo", "naba", "nadega", "não caiam nessa", "não comprem", "nojeira", "nojenta", "nojento", "nojo", "nunca acaba", "olhota", "otaria", "otária", "otario", "otário", "otarios", "otários", "paca", "paciência", "palhaçada", "papo furado", "paspalha", "paspalhao", "paspalhão", "paspalho", "páu", "pau", "peia", "peido", "pemba", "penis", "pênis", "pentelha", "pentelho", "perder tempo", "perdi meu tempo", "perereca", "peru", "perú", "pica", "picao", "picão", "picareta", "picareta!", "pilantra", "pilantragem", "piranha", "piroca", "piroco", "piru", "porra", "pqp", "prega", "prostibulo", "prostíbulo", "prostituta", "prostituto", "punheta", "punhetao", "punhetão", "pus", "pustula", "pústula", "puta", "puto", "puxasaco", "puxa-saco", "quenga", "rabao", "rabão", "rabo", "rabuda", "rabudao", "rabudão", "rabudo", "rabudona", "racha", "rachada", "rachadao", "rachadão", "rachadinha", "rachadinho", "rachado", "ramela", "rapariga", "remela", "retardada", "retardado", "ridicula", "ridícula", "ridículo", "rola", "rolinha", "rosca", "sacana", "sacanagem", "saco", "safada", "safado", "safados", "salafrario", "salafrário", "sapatao", "sapatão", "sifilis", "sífilis", "siririca", "so fala", "só fala", "tarada", "tarado", "tédio", "testuda", "tezao", "tezão", "tezuda", "tezudo", "toma no cu", "tomar no cu", "trocha", "trolha", "troucha", "trouchas", "trouxa", "trouxas", "troxa", "vaca", "vagabunda", "vagabundo", "vagina", "veada", "veadao", "veadão", "veado", "verme", "viada", "viadao", "viadão", "viado", "viados", "vigario", "vigário", "xana", "xaninha", "xavasca", "xerereca", "xexeca", "xibiu", "xibumba", "xochota", "xota", "xoxota"
        )

        fun hasObsceneWord(phrase: String): Boolean {
            val words = phrase.split(" ")

            for (word in words) {
                if (obsceneWordsList.contains(word)){
                    return true
                }
            }
            return false
        }
    }
}