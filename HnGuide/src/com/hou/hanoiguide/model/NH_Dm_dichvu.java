/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hou.hanoiguide.model;

/**
 * NH_Dm_dichvu
 * Model class  
 * @author TrungHieu
 * Created on 7/2/2015 - 9:35
 */

public class NH_Dm_dichvu {
    private String mId_dm_dichvu;
    private String mTen_dm_dichvu;
    private String mMota;
    
    public NH_Dm_dichvu() {
        
    }

    public NH_Dm_dichvu(String mId_dm_dichvu, String mTen_dm_dichvu, String mMota) {
        this.mId_dm_dichvu = mId_dm_dichvu;
        this.mTen_dm_dichvu = mTen_dm_dichvu;
        this.mMota = mMota;
    }

    public String getmId_dm_dichvu() {
        return mId_dm_dichvu;
    }

    public void setmId_dm_dichvu(String mId_dm_dichvu) {
        this.mId_dm_dichvu = mId_dm_dichvu;
    }

    public String getmTen_dm_dichvu() {
        return mTen_dm_dichvu;
    }

    public void setmTen_dm_dichvu(String mTen_dm_dichvu) {
        this.mTen_dm_dichvu = mTen_dm_dichvu;
    }

    public String getmMota() {
        return mMota;
    }

    public void setmMota(String mMota) {
        this.mMota = mMota;
    }
    
}
