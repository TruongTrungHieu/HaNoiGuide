package com.hou.hanoiguide.model;

/**
 * NH_Dm_thoigian
 * Model class  
 * @author TrungHieu
 * Created on 7/2/2015 - 9:35
 */

public class NH_Dm_thoigian {
    private String mId_thoigian;
    private String mThoigian;
    private String mMota;
    
    public NH_Dm_thoigian() {
        
    }
    
    public NH_Dm_thoigian(String mId_thoigian, String mThoigian, String mMota) {
        this.mId_thoigian = mId_thoigian;
        this.mThoigian = mThoigian;
        this.mMota = mMota;
    }

    public String getmId_thoigian() {
        return mId_thoigian;
    }

    public void setmId_thoigian(String mId_thoigian) {
        this.mId_thoigian = mId_thoigian;
    }

    public String getmThoigian() {
        return mThoigian;
    }

    public void setmThoigian(String mThoigian) {
        this.mThoigian = mThoigian;
    }

    public String getmMota() {
        return mMota;
    }

    public void setmMota(String mMota) {
        this.mMota = mMota;
    }
    
    
}
