package com.hou.hanoiguide.model;

/**
 * NH_Nhahang
 * Model class  
 * @author TrungHieu
 * Created on 7/2/2015 - 9:50
 */

public class NH_Nhahang {
    private String mId_nhahang;
    private String mTennhahang;
    private String mMota;
    private String mChitiet;
    private String mWebsite;
    
    public NH_Nhahang() {
        
    }

    public NH_Nhahang(String mId_nhahang, String mTennhahang, String mMota, String mChitiet, String mWebsite) {
        this.mId_nhahang = mId_nhahang;
        this.mTennhahang = mTennhahang;
        this.mMota = mMota;
        this.mChitiet = mChitiet;
        this.mWebsite = mWebsite;
    }

    public String getmId_nhahang() {
        return mId_nhahang;
    }

    public void setmId_nhahang(String mId_nhahang) {
        this.mId_nhahang = mId_nhahang;
    }

    public String getmTennhahang() {
        return mTennhahang;
    }

    public void setmTennhahang(String mTennhahang) {
        this.mTennhahang = mTennhahang;
    }

    public String getmMota() {
        return mMota;
    }

    public void setmMota(String mMota) {
        this.mMota = mMota;
    }

    public String getmChitiet() {
        return mChitiet;
    }

    public void setmChitiet(String mChitiet) {
        this.mChitiet = mChitiet;
    }

    public String getmWebsite() {
        return mWebsite;
    }

    public void setmWebsite(String mWebsite) {
        this.mWebsite = mWebsite;
    }
    
    
}
