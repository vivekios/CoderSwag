package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HATS", "hatimage"),
        Category("HOODIES", "hoodieimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Vivek", "$18", "hat01"),
        Product("Devslopes Hat Black", "$20", "hat02"),
        Product("Devslopes Hat Red", "$25", "hat03"),
        Product("Devslopes Hat White", "$10", "hat04")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie 1", "$18", "hoodie01"),
        Product("Devslopes Hoodie 2", "$20", "hoodie02"),
        Product("Devslopes Hoodie 3", "$25", "hoodie03"),
        Product("Devslopes Hoodie 4", "$10", "hoodie04")
    )

    val shirts = listOf(
        Product("Devslopes Shirt 1", "$18", "shirt01"),
        Product("Devslopes Shirt 2", "$20", "shirt02"),
        Product("Devslopes Shirt 3", "$25", "shirt03"),
        Product("Devslopes Shirt 4", "$10", "shirt04")
    )

}