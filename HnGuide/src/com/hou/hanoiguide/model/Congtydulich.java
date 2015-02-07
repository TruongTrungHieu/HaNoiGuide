package com.hou.hanoiguide;

/**
 * Hang
 * Model class  
 * @author TrungHieu
 * Created on 7/2/2015 - 10:50
 */
public class Congtydulich {
    private String mId_congty;
    private String mTencongty;
    private String mDiachi;
    private String mEmail;
    private String mWebsite;
    private String mSdt;

    public Congtydulich() {
    }

    public Congtydulich(String mId_congty, String mTencongty, String mDiachi, String mEmail, String mWebsite, String mSdt) {
        this.mId_congty = mId_congty;
        this.mTencongty = mTencongty;
        this.mDiachi = mDiachi;
        this.mEmail = mEmail;
        this.mWebsite = mWebsite;
        this.mSdt = mSdt;
    }

    public String getmId_congty() {
        return mId_congty;
    }

    public void setmId_congty(String mId_congty) {
        this.mId_congty = mId_congty;
    }

    public String getmTencongty() {
        return mTencongty;
    }

    public void setmTencongty(String mTencongty) {
        this.mTencongty = mTencongty;
    }

    public String getmDiachi() {
        return mDiachi;
    }

    public void setmDiachi(String mDiachi) {
        this.mDiachi = mDiachi;
    }

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }

    public String getmWebsite() {
        return mWebsite;
    }

    public void setmWebsite(String mWebsite) {
        this.mWebsite = mWebsite;
    }

    public String getmSdt() {
        return mSdt;
    }

    public void setmSdt(String mSdt) {
        this.mSdt = mSdt;
    }
    
    
}
