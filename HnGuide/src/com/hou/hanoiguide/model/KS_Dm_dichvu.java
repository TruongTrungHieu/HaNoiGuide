
package com.hou.hanoiguide.model;

/**
 * KS_Dm_dichvu
 Model class for 
 Created on 06/02/15 - 4:06 pm 
 Edited on
 * @author NgocTan
 */
public class KS_Dm_dichvu {
    private String mId_dm_dv;
    private String mTendv;
    private String mMota;
    private String mIcon;

    public KS_Dm_dichvu() {
    }

    public KS_Dm_dichvu(String mId_dm_dv, String mTendv, String mMota, String mIcon) {
        this.mId_dm_dv = mId_dm_dv;
        this.mTendv = mTendv;
        this.mMota = mMota;
        this.mIcon = mIcon;
    }

    public String getmId_dm_dv() {
        return mId_dm_dv;
    }

    public void setmId_dm_dv(String mId_dm_dv) {
        this.mId_dm_dv = mId_dm_dv;
    }

    public String getmTendv() {
        return mTendv;
    }

    public void setmTendv(String mTendv) {
        this.mTendv = mTendv;
    }

    public String getmMota() {
        return mMota;
    }

    public void setmMota(String mMota) {
        this.mMota = mMota;
    }

    public String getmIcon() {
        return mIcon;
    }

    public void setmIcon(String mIcon) {
        this.mIcon = mIcon;
    }
    
    
}
