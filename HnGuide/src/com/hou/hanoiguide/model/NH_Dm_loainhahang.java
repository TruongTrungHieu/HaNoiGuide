/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hou.hanoiguide;

/**
 * NH_Dm_loainhahang
 * Model class  
 * @author TrungHieu
 * Created on 7/2/2015 - 9:35
 */

public class NH_Dm_loainhahang {
    private String mId_dm_loai;
    private String mTenloai;
    private String mMota;
    
    public NH_Dm_loainhahang() {
        
    }

    public NH_Dm_loainhahang(String mId_dm_loai, String mTenloai, String mMota) {
        this.mId_dm_loai = mId_dm_loai;
        this.mTenloai = mTenloai;
        this.mMota = mMota;
    }

    public String getmId_dm_loai() {
        return mId_dm_loai;
    }

    public void setmId_dm_loai(String mId_dm_loai) {
        this.mId_dm_loai = mId_dm_loai;
    }

    public String getmTenloai() {
        return mTenloai;
    }

    public void setmTenloai(String mTenloai) {
        this.mTenloai = mTenloai;
    }

    public String getmMota() {
        return mMota;
    }

    public void setmMota(String mMota) {
        this.mMota = mMota;
    }
    
    
}
