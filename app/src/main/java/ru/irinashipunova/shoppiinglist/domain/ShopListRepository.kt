package ru.irinashipunova.shoppiinglist.domain

interface ShopListRepository {
    fun getShopItem(shopItemId: Int): ShopItem
    fun getShopList(): List<ShopItem>
    fun editShopItem()
    fun addShopItem(shopItem: ShopItem)
    fun deleteSShopItem(shopItem: ShopItem)
}