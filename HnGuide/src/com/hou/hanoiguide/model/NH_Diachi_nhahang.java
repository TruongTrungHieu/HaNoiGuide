package com.hou.hanoiguide.model;

/**
 * NH_Diachi_nhahang
 * Model class  
 * @author TrungHieu
 * Created on 7/2/2015 - 9:50
 */

public class NH_Diachi_nhahang {
    private String mLocation;
    private String mId_nhahang;
    private String mSdt;
    private String mDiachil;
    private String mNguoilienhe;
    private String mEmail;
    
    public NH_Diachi_nhahang() {
        
    }

    public NH_Diachi_nhahang(String mLocation, String mId_nhahang, String mSdt, String mDiachil, String mNguoilienhe, String mEmail) {
        this.mLocation = mLocation;
        this.mId_nhahang = mId_nhahang;
        this.mSdt = mSdt;
        this.mDiachil = mDiachil;
        this.mNguoilienhe = mNguoilienhe;
        this.mEmail = mEmail;
    }

    public String getmLocation() {
        return mLocation;
    }

    public void setmLocation(String mLocation) {
        this.mLocation = mLocation;
    }

    public String getmId_nhahang() {
        return mId_nhahang;
    }

    public void setmId_nhahang(String mId_nhahang) {
        this.mId_nhahang = mId_nhahang;
    }

    public String getmSdt() {
        return mSdt;
    }

    public void setmSdt(String mSdt) {
        this.mSdt = mSdt;
    }

    public String getmDiachil() {
        return mDiachil;
    }

    public void setmDiachil(String mDiachil) {
        this.mDiachil = mDiachil;
    }

    public String getmNguoilienhe() {
        return mNguoilienhe;
    }

    public void setmNguoilienhe(String mNguoilienhe) {
        this.mNguoilienhe = mNguoilienhe;
    }

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }
    
    
}
