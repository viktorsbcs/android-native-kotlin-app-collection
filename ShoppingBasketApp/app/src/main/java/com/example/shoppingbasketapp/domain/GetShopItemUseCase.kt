package com.example.shoppingbasketapp.domain

class GetShopItemUseCase(private val _shopListRepository: IShopListRepository) {

    fun getShopItem(shopItemId: Int): ShopItem {
        val shopItem = _shopListRepository.getShopItem(shopItemId)
        return shopItem
    }
}