/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hou.hanoiguide;

/**
 * Hang
 * Model class  
 * @author TrungHieu
 * Created on 7/2/2015 - 10:50
 */

public class Hang {
    private String mId_hang;
    private String mTenhang;
    private String mDiachi;
    private String mWebsite;
    private String mMota;

    public Hang() {
    }

    public Hang(String mId_hang, String mTenhang, String mDiachi, String mWebsite, String mMota) {
        this.mId_hang = mId_hang;
        this.mTenhang = mTenhang;
        this.mDiachi = mDiachi;
        this.mWebsite = mWebsite;
        this.mMota = mMota;
    }

    public String getmId_hang() {
        return mId_hang;
    }

    public void setmId_hang(String mId_hang) {
        this.mId_hang = mId_hang;
    }

    public String getmTenhang() {
        return mTenhang;
    }

    public void setmTenhang(String mTenhang) {
        this.mTenhang = mTenhang;
    }

    public String getmDiachi() {
        return mDiachi;
    }

    public void setmDiachi(String mDiachi) {
        this.mDiachi = mDiachi;
    }

    public String getmWebsite() {
        return mWebsite;
    }

    public void setmWebsite(String mWebsite) {
        this.mWebsite = mWebsite;
    }

    public String getmMota() {
        return mMota;
    }

    public void setmMota(String mMota) {
        this.mMota = mMota;
    }
    
    
}
