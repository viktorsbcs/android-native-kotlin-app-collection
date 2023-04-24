package com.example.shoppingbasketapp.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.shoppingbasketapp.domain.IShopListRepository
import com.example.shoppingbasketapp.domain.ShopItem

class ShopListRepository : IShopListRepository {

    private var _currentId = 0
    private val _shopListLiveData = MutableLiveData<List<ShopItem>>()
    private val _shopList = mutableListOf<ShopItem>()

    init {
        addShopItemUseCase(ShopItem("Book", 3, true ))
        addShopItemUseCase(ShopItem("Journal", 1, true ))
        addShopItemUseCase(ShopItem("Stickers", 12, true ))
    }
    override fun addShopItemUseCase(shopItem: ShopItem) {
        if(shopItem.id == ShopItem.UNDEFINED_ID){
            shopItem.id = _currentId++
        }
        _shopList.add(shopItem)
        updateShopListLiveData()
    }

    override fun deleteShopItemUseCase(shopItem: ShopItem) {
        _shopList.remove(shopItem)
        updateShopListLiveData()
    }

    override fun editShopItem(shopItem: ShopItem) {
        var oldShopItem = getShopItem(shopItem.id)

        _shopList.remove(oldShopItem)
        _shopList.add(shopItem)
        updateShopListLiveData()
    }

    override fun getShopItem(shopItemId: Int): ShopItem {
        return _shopList.find {it.id == shopItemId} ?: throw java.lang.RuntimeException("ShopItem Id not found")
    }

    override fun getShopList(): LiveData<List<ShopItem>> {
        return _shopListLiveData
    }

    private fun updateShopListLiveData(){
        _shopListLiveData.value = _shopList.toList()
    }
}