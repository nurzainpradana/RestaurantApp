package com.zainpradana.restaurantapp

data class Product (
    var namaMenu: String = "",
    var hargaMenu: Int = 0,
    var jumlahMenu: Int = 0
) {
    val subtotal: Int
        get() = jumlahMenu * hargaMenu
}