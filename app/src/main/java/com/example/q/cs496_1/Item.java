package com.example.q.cs496_1;

public class Item {
    public String mName;
    public String mPhone;
    public String mHome;

    public Item(String name, String phone, String home) {
        mName = name;
        mPhone = phone;
        mHome = home;
    }

    public String getName() {
        return mName;
    }

    public String getPhone(){
        return mPhone;
    }

    public String getHome() {
        return mHome;
    }
}
