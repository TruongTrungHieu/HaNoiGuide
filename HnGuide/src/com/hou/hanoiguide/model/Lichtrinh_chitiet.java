package com.hou.hanoiguide;

/**
 * Lichtrinh_chitiet
 * Model class  
 * @author TrungHieu
 * Created on 7/2/2015 - 10:50
 */

public class Lichtrinh_chitiet {
    private String mId_lichtrinh_chitiet;
    private int mSothutu_diemden;
    private String mId_diemden;
    private String mImg;
    private String mId_lichtrinh;
    private String mMota;

    public Lichtrinh_chitiet() {
    }

    public Lichtrinh_chitiet(String mId_lichtrinh_chitiet, int mSothutu_diemden, String mId_diemden, String mImg, String mId_lichtrinh, String mMota) {
        this.mId_lichtrinh_chitiet = mId_lichtrinh_chitiet;
        this.mSothutu_diemden = mSothutu_diemden;
        this.mId_diemden = mId_diemden;
        this.mImg = mImg;
        this.mId_lichtrinh = mId_lichtrinh;
        this.mMota = mMota;
    }
    
    public String getmId_lichtrinh_chitiet() {
        return mId_lichtrinh_chitiet;
    }

    public void setmId_lichtrinh_chitiet(String mId_lichtrinh_chitiet) {
        this.mId_lichtrinh_chitiet = mId_lichtrinh_chitiet;
    }

    public int getmSothutu_diemden() {
        return mSothutu_diemden;
    }

    public void setmSothutu_diemden(int mSothutu_diemden) {
        this.mSothutu_diemden = mSothutu_diemden;
    }

    public String getmId_diemden() {
        return mId_diemden;
    }

    public void setmId_diemden(String mId_diemden) {
        this.mId_diemden = mId_diemden;
    }

    public String getmImg() {
        return mImg;
    }

    public void setmImg(String mImg) {
        this.mImg = mImg;
    }

    public String getmId_lichtrinh() {
        return mId_lichtrinh;
    }

    public void setmId_lichtrinh(String mId_lichtrinh) {
        this.mId_lichtrinh = mId_lichtrinh;
    }

    public String getmMota() {
        return mMota;
    }

    public void setmMota(String mMota) {
        this.mMota = mMota;
    }
    
    
}
