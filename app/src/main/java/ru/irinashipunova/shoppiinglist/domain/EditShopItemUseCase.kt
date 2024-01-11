package ru.irinashipunova.shoppiinglist.domain

class EditShopItemUseCase (private  val shopListRepository: ShopListRepository) {
    fun editShopItem(){
        shopListRepository.editShopItem()
    }
}