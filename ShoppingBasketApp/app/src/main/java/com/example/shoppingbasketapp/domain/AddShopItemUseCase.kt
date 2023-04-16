package com.example.shoppingbasketapp.domain

class AddShopItemUseCase(private val _shopListRepository: IShopListRepository) {

    fun addShopItemUseCase(shopItem: ShopItem) {
        _shopListRepository.addShopItemUseCase(shopItem)
    }
}