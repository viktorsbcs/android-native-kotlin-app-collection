package com.example.shoppingbasketapp.domain

import androidx.lifecycle.LiveData

class GetShopListUseCase(private val _shopListRepository: IShopListRepository) {

    fun getShopList(): LiveData<List<ShopItem>> {
        val shopList = _shopListRepository.getShopList()
        return shopList
    }
}