package com.example.shoppingbasketapp.domain

class EditShopItemUseCase(private val _shopListRepository: IShopListRepository) {

    fun editShopItem(shopItem: ShopItem) {
        _shopListRepository.editShopItem(shopItem)
    }
}