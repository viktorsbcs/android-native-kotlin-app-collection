package com.example.shoppingbasketapp.domain

import androidx.lifecycle.LiveData

interface IShopListRepository {

    fun addShopItemUseCase(shopItem: ShopItem)
    fun deleteShopItemUseCase(shopItem: ShopItem)
    fun editShopItem(shopItem: ShopItem)
    fun getShopItem(shopItemId: Int): ShopItem
    fun getShopList(): LiveData<List<ShopItem>>
}