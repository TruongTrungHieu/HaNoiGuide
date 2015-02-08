
package com.hou.hanoiguide.model;

/**
 * NH_Dm_danhgia
 * Model class  
 * @author TrungHieu
 * Created on 7/2/2015 - 9:35
 */

public class NH_Dm_danhgia {
    private String mId_danhgia;
    private String mTendanhgia;
    private String mMota;
    
    public NH_Dm_danhgia() {
        
    }

    public NH_Dm_danhgia(String mId_danhgia, String mTendanhgia, String mMota) {
        this.mId_danhgia = mId_danhgia;
        this.mTendanhgia = mTendanhgia;
        this.mMota = mMota;
    }

    public String getmId_danhgia() {
        return mId_danhgia;
    }

    public void setmId_danhgia(String mId_danhgia) {
        this.mId_danhgia = mId_danhgia;
    }

    public String getmTendanhgia() {
        return mTendanhgia;
    }

    public void setmTendanhgia(String mTendanhgia) {
        this.mTendanhgia = mTendanhgia;
    }

    public String getmMota() {
        return mMota;
    }

    public void setmMota(String mMota) {
        this.mMota = mMota;
    }
    
    
}
