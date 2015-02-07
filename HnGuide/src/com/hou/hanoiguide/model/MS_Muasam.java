

package com.hou.hanoiguide.model;

/**
 * MS_Muasam
 Model class for 
 Created on 06/02/15 - 4:06 pm 
 Edited on
 * @author NgocTan
 */
public class MS_Muasam {
    private String mId_muasam;
    private String mTendiemmuasam;
    private String mWebsite;
    private String mMota;
    private String mChitiet;

    public MS_Muasam() {
    }

    public MS_Muasam(String mId_muasam, String mTendiemmuasam, String mWebsite, String mMota, String mChitiet) {
        this.mId_muasam = mId_muasam;
        this.mTendiemmuasam = mTendiemmuasam;
        this.mWebsite = mWebsite;
        this.mMota = mMota;
        this.mChitiet = mChitiet;
    }

    public String getmId_muasam() {
        return mId_muasam;
    }

    public void setmId_muasam(String mId_muasam) {
        this.mId_muasam = mId_muasam;
    }

    public String getmTendiemmuasam() {
        return mTendiemmuasam;
    }

    public void setmTendiemmuasam(String mTendiemmuasam) {
        this.mTendiemmuasam = mTendiemmuasam;
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

    public String getmChitiet() {
        return mChitiet;
    }

    public void setmChitiet(String mChitiet) {
        this.mChitiet = mChitiet;
    }
    
}
