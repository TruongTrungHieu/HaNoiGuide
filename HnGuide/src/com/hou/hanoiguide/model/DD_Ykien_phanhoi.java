
package com.hou.hanoiguide.model;

/**
 * DD_Ykien_phanhoi 
 Model class for 
 Created on 06/02/15 - 4:06 pm 
 Edited on
 * @author NgocTan
 */
public class DD_Ykien_phanhoi {
    private String mId_danhgia;
    private String mId_phanhoi;
    private String mId_diemDL;
    private String mNoidung;
    private String mThoigian;
    private String mUser;

    public DD_Ykien_phanhoi() {
        
    }
    
    public DD_Ykien_phanhoi(String mId_danhgia, String mId_phanhoi, String mId_diemDL, 
                            String mNoidung, String mThoigian, String mUser) {
        this.mId_danhgia = mId_danhgia;
        this.mId_phanhoi = mId_phanhoi;
        this.mId_diemDL = mId_diemDL;
        this.mNoidung = mNoidung;
        this.mThoigian = mThoigian;
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

    public String getmId_diemDL() {
        return mId_diemDL;
    }

    public void setmId_diemDL(String mId_diemDL) {
        this.mId_diemDL = mId_diemDL;
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
        
}
