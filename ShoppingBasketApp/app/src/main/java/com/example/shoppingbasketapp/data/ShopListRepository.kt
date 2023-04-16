package com.example.shoppingbasketapp.data

import com.example.shoppingbasketapp.domain.IShopListRepository
import com.example.shoppingbasketapp.domain.ShopItem

class ShopListRepository : IShopListRepository {

    override fun addShopItemUseCase(shopItem: ShopItem) {
        TODO("Not yet implemented")
    }

    override fun deleteShopItemUseCase(shopItem: ShopItem) {
        TODO("Not yet implemented")
    }

    override fun editShopItem(shopItem: ShopItem) {
        TODO("Not yet implemented")
    }

    override fun getShopItem(shopItemId: Int): ShopItem {
        TODO("Not yet implemented")
    }

    override fun getShopList(): List<ShopItem> {
        TODO("Not yet implemented")
    }

}