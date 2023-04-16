package com.example.shoppingbasketapp.domain

class GetShopListUseCase(private val _shopListRepository: IShopListRepository) {

    fun getShopList(): List<ShopItem> {
        val shopList = _shopListRepository.getShopList()
        return shopList
    }
}