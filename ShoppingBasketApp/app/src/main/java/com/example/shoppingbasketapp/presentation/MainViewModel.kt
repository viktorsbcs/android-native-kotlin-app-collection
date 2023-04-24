package com.example.shoppingbasketapp.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoppingbasketapp.data.ShopListRepository
import com.example.shoppingbasketapp.domain.DeleteShopItemUseCase
import com.example.shoppingbasketapp.domain.EditShopItemUseCase
import com.example.shoppingbasketapp.domain.GetShopListUseCase
import com.example.shoppingbasketapp.domain.ShopItem

class MainViewModel : ViewModel(){

    private val _repo =  ShopListRepository();
    private val _getShopListUseCase = GetShopListUseCase(_repo)
    private val _deleteShopItemUseCase = DeleteShopItemUseCase(_repo)
    private val _editShopItemUseCase = EditShopItemUseCase(_repo)

    val shopList = _getShopListUseCase.getShopList()

    fun changeEnableState(shopItem: ShopItem){
        val newShopItem = ShopItem(shopItem.name, shopItem.count, !shopItem.enabled)
        _editShopItemUseCase.editShopItem(newShopItem)
    }

    fun deleteShopItem(shopItem: ShopItem){
        _deleteShopItemUseCase.deleteShopItemUseCase(shopItem)
    }
}