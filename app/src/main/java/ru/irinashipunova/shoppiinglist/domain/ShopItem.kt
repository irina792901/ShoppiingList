package ru.irinashipunova.shoppiinglist.domain

data class ShopItem(
    val id: Int,
    val name: String,
    val count: Int,
    val enable: Boolean
)
