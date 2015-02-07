
package com.hou.hanoiguide.model;

/**
 * MS_Diachi_muasam
 Model class for 
 Created on 06/02/15 - 4:06 pm 
 Edited on
 * @author NgocTan
 */
public class MS_Diachi_muasam {
    private String mId_muasam;
    private String mLoacation;
    private String mSdt;
    private String mNguoilienhe;
    private String mEmail;
    private String mDiachi;
    private String mGhichu;

    public MS_Diachi_muasam() {
    }

    public MS_Diachi_muasam(String mId_muasam, String mLoacation, String mSdt, String mNguoilienhe, String mEmail, String mDiachi, String mGhichu) {
        this.mId_muasam = mId_muasam;
        this.mLoacation = mLoacation;
        this.mSdt = mSdt;
        this.mNguoilienhe = mNguoilienhe;
        this.mEmail = mEmail;
        this.mDiachi = mDiachi;
        this.mGhichu = mGhichu;
    }

    public String getmId_muasam() {
        return mId_muasam;
    }

    public void setmId_muasam(String mId_muasam) {
        this.mId_muasam = mId_muasam;
    }

    public String getmLoacation() {
        return mLoacation;
    }

    public void setmLoacation(String mLoacation) {
        this.mLoacation = mLoacation;
    }

    public String getmSdt() {
        return mSdt;
    }

    public void setmSdt(String mSdt) {
        this.mSdt = mSdt;
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

    public String getmDiachi() {
        return mDiachi;
    }

    public void setmDiachi(String mDiachi) {
        this.mDiachi = mDiachi;
    }

    public String getmGhichu() {
        return mGhichu;
    }

    public void setmGhichu(String mGhichu) {
        this.mGhichu = mGhichu;
    }
    
    
}
