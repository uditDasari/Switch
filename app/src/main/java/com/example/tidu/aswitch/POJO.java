package com.example.tidu.aswitch;

import android.widget.ImageView;
import android.widget.TextView;

public class POJO {
    int company,arrrow;
    String price;

    public int getCompany() {
        return company;
    }

    public void setCompany(Integer company) {
        this.company = company;
    }

    public int getArrrow() {
        return arrrow;
    }

    public void setArrrow(int arrrow) {
        this.arrrow = arrrow;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public POJO(int company,int arrrow, String price) {
        this.company = company;
        this.arrrow = arrrow;
        this.price = price;
    }
}
