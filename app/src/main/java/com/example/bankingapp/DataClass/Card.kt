package com.example.bankingapp.DataClass

import androidx.compose.ui.graphics.Brush

data class Card(
    val cardType:String,
    val cardName:String,
    val balance:Double,
    val cardNumber: String,
    val color:Brush
)
