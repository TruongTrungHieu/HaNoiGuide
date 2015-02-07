

package com.hou.hanoiguide.model;

/**
 * KS_Ykien_phanhoi
 Model class for 
 Created on 06/02/15 - 4:06 pm 
 Edited on
 * @author NgocTan
 */
public class KS_Ykien_phanhoi {
    private String mId_danhgia;
    private String mId_phanhoi;
    private String mId_khachsan;
    private String mNoidung;
    private String mTg;
    private String mUser;

    public KS_Ykien_phanhoi() {
    }

    public KS_Ykien_phanhoi(String mId_danhgia, String mId_phanhoi, String mId_khachsan, String mNoidung, String mTg, String mUser) {
        this.mId_danhgia = mId_danhgia;
        this.mId_phanhoi = mId_phanhoi;
        this.mId_khachsan = mId_khachsan;
        this.mNoidung = mNoidung;
        this.mTg = mTg;
        this.mUser = mUser;
    }

    public String getmId_danhgia() {
        return mId_danhgia;
    }

    public void setmId_danhgia(String mId_danhgia) {
        this.mId_danhgia = mId_danhgia;
    }

    public String getmId_phanhoi() {
        return mId_phanhoi;
    }

    public void setmId_phanhoi(String mId_phanhoi) {
        this.mId_phanhoi = mId_phanhoi;
    }

    public String getmId_khachsan() {
        return mId_khachsan;
    }

    public void setmId_khachsan(String mId_khachsan) {
        this.mId_khachsan = mId_khachsan;
    }

    public String getmNoidung() {
        return mNoidung;
    }

    public void setmNoidung(String mNoidung) {
        this.mNoidung = mNoidung;
    }

    public String getmTg() {
        return mTg;
    }

    public void setmTg(String mTg) {
        this.mTg = mTg;
    }

    public String getmUser() {
        return mUser;
    }

    public void setmUser(String mUser) {
        this.mUser = mUser;
    }
    
    
}
