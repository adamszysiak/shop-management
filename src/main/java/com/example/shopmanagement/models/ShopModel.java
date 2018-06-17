package com.example.shopmanagement.models;

import javax.persistence.*;

@Entity
public class ShopModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    @Column(name = "ID")
    public Long id;

    @Column(name = "SHOPNAME")
    public String shopName;

    @Column(name = "DESCRIPTION")
    public String description;

    @Column(name = "ADDRESS")
    public String address;

    @Column(name = "LAT")
    public String LAT;

    @Column(name = "LNG")
    public String LNG;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getShopName()
    {
        return shopName;
    }

    public void setShopName(String shopName)
    {
        this.shopName = shopName;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getAdressess()
    {
        return address;
    }

    public void setAdressess(String adressess)
    {
        this.address = adressess;
    }

    public String getLAT()
    {
        return LAT;
    }

    public void setLAT(String LAT)
    {
        this.LAT = LAT;
    }

    public String getLNG()
    {
        return LNG;
    }

    public void setLNG(String LNG)
    {
        this.LNG = LNG;
    }
}
