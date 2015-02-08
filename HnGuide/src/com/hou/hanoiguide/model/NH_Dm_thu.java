package com.hou.hanoiguide.model;

/**
 * NH_Dm_thu
 * Model class  
 * @author TrungHieu
 * Created on 7/2/2015 - 9:50
 */

public class NH_Dm_thu {
    private String mId_thu;
    private String mThu;
    private String mMota;
    
    public NH_Dm_thu() {
        
    }

    public NH_Dm_thu(String mId_thu, String mThu, String mMota) {
        this.mId_thu = mId_thu;
        this.mThu = mThu;
        this.mMota = mMota;
    }

    public String getmId_thu() {
        return mId_thu;
    }

    public void setmId_thu(String mId_thu) {
        this.mId_thu = mId_thu;
    }

    public String getmThu() {
        return mThu;
    }

    public void setmThu(String mThu) {
        this.mThu = mThu;
    }

    public String getmMota() {
        return mMota;
    }

    public void setmMota(String mMota) {
        this.mMota = mMota;
    }
    
    
}
