package com.hou.hanoiguide;

/**
 * Lichtrinh
 * Model class  
 * @author TrungHieu
 * Created on 7/2/2015 - 10:50
 */

public class Lichtrinh {
    private String mId_lichtrinh;
    private String mTenlichtrinh;
    private String mThoigian;
    private float mTongquangduong;
    private String mId_congty;
    private String mGhichu;

    public Lichtrinh() {
    }

    public Lichtrinh(String mId_lichtrinh, String mTenlichtrinh, String mThoigian, float mTongquangduong, String mId_congty, String mGhichu) {
        this.mId_lichtrinh = mId_lichtrinh;
        this.mTenlichtrinh = mTenlichtrinh;
        this.mThoigian = mThoigian;
        this.mTongquangduong = mTongquangduong;
        this.mId_congty = mId_congty;
        this.mGhichu = mGhichu;
    }

    public String getmId_lichtrinh() {
        return mId_lichtrinh;
    }

    public void setmId_lichtrinh(String mId_lichtrinh) {
        this.mId_lichtrinh = mId_lichtrinh;
    }

    public String getmTenlichtrinh() {
        return mTenlichtrinh;
    }

    public void setmTenlichtrinh(String mTenlichtrinh) {
        this.mTenlichtrinh = mTenlichtrinh;
    }

    public String getmThoigian() {
        return mThoigian;
    }

    public void setmThoigian(String mThoigian) {
        this.mThoigian = mThoigian;
    }

    public float getmTongquangduong() {
        return mTongquangduong;
    }

    public void setmTongquangduong(float mTongquangduong) {
        this.mTongquangduong = mTongquangduong;
    }

    public String getmId_congty() {
        return mId_congty;
    }

    public void setmId_congty(String mId_congty) {
        this.mId_congty = mId_congty;
    }

    public String getmGhichu() {
        return mGhichu;
    }

    public void setmGhichu(String mGhichu) {
        this.mGhichu = mGhichu;
    }
    
    
}
