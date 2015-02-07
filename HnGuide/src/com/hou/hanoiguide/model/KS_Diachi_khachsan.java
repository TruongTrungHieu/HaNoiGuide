
package com.hou.hanoiguide.model;

/**
 * KS_Diachi_khachsan
 Model class for 
 Created on 06/02/15 - 4:06 pm 
 Edited on
 * @author NgocTan
 */
public class KS_Diachi_khachsan {
    private String mId_khachsan;
    private String mSdt;
    private String mDiachi;
    private String mLocation;
    private String mNguoilienhe;
    private String mEmail;

    public KS_Diachi_khachsan() {
    }

    public KS_Diachi_khachsan(String mId_khachsan, String mSdt, String mDiachi, String mLocation, String mNguoilienhe, String mEmail) {
        this.mId_khachsan = mId_khachsan;
        this.mSdt = mSdt;
        this.mDiachi = mDiachi;
        this.mLocation = mLocation;
        this.mNguoilienhe = mNguoilienhe;
        this.mEmail = mEmail;
    }

    public String getmId_khachsan() {
        return mId_khachsan;
    }

    public void setmId_khachsan(String mId_khachsan) {
        this.mId_khachsan = mId_khachsan;
    }

    public String getmSdt() {
        return mSdt;
    }

    public void setmSdt(String mSdt) {
        this.mSdt = mSdt;
    }

    public String getmDiachi() {
        return mDiachi;
    }

    public void setmDiachi(String mDiachi) {
        this.mDiachi = mDiachi;
    }

    public String getmLocation() {
        return mLocation;
    }

    public void setmLocation(String mLocation) {
        this.mLocation = mLocation;
    }

    public String getmNguoilienhe() {
        return mNguoilienhe;
    }

    public void setmNguoilienhe(String mNguoilienhe) {
        this.mNguoilienhe = mNguoilienhe;
    }

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }
    
    
}
