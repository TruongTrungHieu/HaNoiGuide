/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hou.hanoiguide;

/**
 * NH_Ykien_phanhoi
 * Model class  
 * @author TrungHieu
 * Created on 7/2/2015 - 9:50
 */

public class NH_Ykien_phanhoi {
    private String mId_phanhoi;
    private String mId_nhahang;
    private String mNoidung;
    private String mThoigian;
    private String mUser;
    private String mIid_danhgia;
    
    public NH_Ykien_phanhoi() {
        
    }

    public NH_Ykien_phanhoi(String mId_phanhoi, String mId_nhahang, String mNoidung, String mThoigian, String mUser, String mIid_danhgia) {
        this.mId_phanhoi = mId_phanhoi;
        this.mId_nhahang = mId_nhahang;
        this.mNoidung = mNoidung;
        this.mThoigian = mThoigian;
        this.mUser = mUser;
        this.mIid_danhgia = mIid_danhgia;
    }

    public String getmId_phanhoi() {
        return mId_phanhoi;
    }

    public void setmId_phanhoi(String mId_phanhoi) {
        this.mId_phanhoi = mId_phanhoi;
    }

    public String getmId_nhahang() {
        return mId_nhahang;
    }

    public void setmId_nhahang(String mId_nhahang) {
        this.mId_nhahang = mId_nhahang;
    }

    public String getmNoidung() {
        return mNoidung;
    }

    public void setmNoidung(String mNoidung) {
        this.mNoidung = mNoidung;
    }

    public String getmThoigian() {
        return mThoigian;
    }

    public void setmThoigian(String mThoigian) {
        this.mThoigian = mThoigian;
    }

    public String getmUser() {
        return mUser;
    }

    public void setmUser(String mUser) {
        this.mUser = mUser;
    }

    public String getmIid_danhgia() {
        return mIid_danhgia;
    }

    public void setmIid_danhgia(String mIid_danhgia) {
        this.mIid_danhgia = mIid_danhgia;
    }
    
    
}
