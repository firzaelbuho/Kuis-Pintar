package com.proximastudio.kuispintar.model

data class QuestionSet (
    val id:Int,
    val question: String,
    val key : String,
    val cat : String,
    val opta : String,
    val optb : String,
    val optc : String,
    val optd : String,
    val opte : String
)