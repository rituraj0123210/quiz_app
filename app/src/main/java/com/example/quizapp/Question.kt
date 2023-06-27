package com.example.quizapp

import android.media.Image

data class Question(
    val Id: Int,
    val question: String,
    val image: Int,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
val correctAnswer: Int


)
