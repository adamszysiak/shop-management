package com.example.shopmanagement.services;

import com.example.shopmanagement.models.ShopModel;

import java.util.List;

public interface ShopService
{
    List<ShopModel> getShopList();
    void saveShop(ShopModel shopModel);
    ShopModel getShop(Long id);
    void deleteShop(Long id);
}
