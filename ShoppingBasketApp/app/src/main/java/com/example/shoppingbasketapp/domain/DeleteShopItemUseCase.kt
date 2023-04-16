package com.example.shoppingbasketapp.domain

class DeleteShopItemUseCase(private val _shopListRepository: IShopListRepository) {

    fun deleteShopItemUseCase(shopItem: ShopItem) {
        _shopListRepository.deleteShopItemUseCase(shopItem)
    }
}