package com.example.hw5;

import java.io.Serializable;

public class ImageView implements Serializable {
    private int continent,country;
    private Integer keyId;

    public ImageView(int image) {
        this.continent=image;
    }

    public int getContinent() {
        return continent;
    }

    public void setContinent(int continent) {
        this.continent = continent;
    }

    public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        this.country = country;
    }

    public Integer getKeyId() {
        return keyId;
    }
}
