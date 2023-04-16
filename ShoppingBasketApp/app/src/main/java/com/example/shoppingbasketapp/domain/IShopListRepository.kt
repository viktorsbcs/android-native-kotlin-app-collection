package com.example.shoppingbasketapp.domain

interface IShopListRepository {

    fun addShopItemUseCase(shopItem: ShopItem)
    fun deleteShopItemUseCase(shopItem: ShopItem)
    fun editShopItem(shopItem: ShopItem)
    fun getShopItem(shopItemId: Int): ShopItem
    fun getShopList(): List<ShopItem>
}