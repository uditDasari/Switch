package com.example.tidu.aswitch;

import android.widget.ImageView;
import android.widget.TextView;

public class POJO {
    String company,arrrow,price;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getArrrow() {
        return arrrow;
    }

    public void setArrrow(String arrrow) {
        this.arrrow = arrrow;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public POJO(String company, String arrrow, String price) {
        this.company = company;
        this.arrrow = arrrow;
        this.price = price;
    }
}
