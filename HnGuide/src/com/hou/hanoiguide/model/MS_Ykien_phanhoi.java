

package com.hou.hanoiguide.model;

/**
 * MS_Ykien_phanhoi
 Model class for 
 Created on 06/02/15 - 4:06 pm 
 Edited on
 * @author NgocTan
 */
public class MS_Ykien_phanhoi {
    private String mId_phanhoi;
    private String mId_muasam;
    private String mNoidung;
    private String mThoigian;
    private String mUser;
    private String mId_danhgia;

    public MS_Ykien_phanhoi() {
    }

    public MS_Ykien_phanhoi(String mId_phanhoi, String mId_muasam, String mNoidung, String mThoigian, String mUser, String mId_danhgia) {
        this.mId_phanhoi = mId_phanhoi;
        this.mId_muasam = mId_muasam;
        this.mNoidung = mNoidung;
        this.mThoigian = mThoigian;
        this.mUser = mUser;
        this.mId_danhgia = mId_danhgia;
    }

    public String getmId_phanhoi() {
        return mId_phanhoi;
    }

    public void setmId_phanhoi(String mId_phanhoi) {
        this.mId_phanhoi = mId_phanhoi;
    }

    public String getmId_muasam() {
        return mId_muasam;
    }

    public void setmId_muasam(String mId_muasam) {
        this.mId_muasam = mId_muasam;
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

    public String getmId_danhgia() {
        return mId_danhgia;
    }

    public void setmId_danhgia(String mId_danhgia) {
        this.mId_danhgia = mId_danhgia;
    }
    
    
}
