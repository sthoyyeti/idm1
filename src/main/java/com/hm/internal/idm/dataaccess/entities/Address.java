package com.hm.internal.idm.dataaccess.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ADDRESS")

public class Address extends EntityBase implements Serializable {


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ENTERPRISE_ID", referencedColumnName = "ID")
    private Enterprise enterPriseId;

    @Column(name = "HOUSE_NAME")
    private String houseName;
    @Column(name = "STREET")
    private String street;
    @Column(name = "CITY")
    private String city;
    @Column(name = "COUNTY")
    private String county;
    @Column(name = "COUNTRY")
    private String country;
    @Column(name = "POST_CODE")
    private String postCode;
    public Address (){};

    public Address(Enterprise enterPriseId, String houseName, String street, String city, String country, String postCode) {
        this.enterPriseId = enterPriseId;
        this.houseName = houseName;
        this.street = street;
        this.city = city;
        this.county = county;
        this.country = country;
        this.postCode = postCode;
    }

    public Enterprise getEnterPriseId() {
        return enterPriseId;
    }

    public void setEnterPriseId(Enterprise enterPriseId) {
        this.enterPriseId = enterPriseId;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
}
