package ru.irinashipunova.shoppiinglist.domain

class DeleteShopItemUseCase (private  val shopListRepository: ShopListRepository) {

    fun deleteSShopItem(shopItem: ShopItem){
        shopListRepository.deleteSShopItem(shopItem)
    }
}