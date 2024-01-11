package ru.irinashipunova.shoppiinglist.domain

class GetShopListUseCase (private  val sshopItemRepository: ShopListRepository) {

    fun getShopList(): List<ShopItem> {
        return sshopItemRepository.getShopList()
    }
}