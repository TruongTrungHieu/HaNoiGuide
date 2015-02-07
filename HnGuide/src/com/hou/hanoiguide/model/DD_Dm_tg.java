
package com.hou.hanoiguide.model;

/**
 * DD_Dm_tg
 * Model class for 
 * 
 * @author NgocTan
 * Created on 06/02/15 - 4:06 pm
 * 
 
 */
public class DD_Dm_tg {
    private String mId_tg;
    private String mThoigian;

    public DD_Dm_tg() {
    }

    public DD_Dm_tg(String mId_tg, String mThoigian) {
        this.mId_tg = mId_tg;
        this.mThoigian = mThoigian;
    }

    public String getmId_tg() {
        return mId_tg;
    }

    public void setmId_tg(String mId_tg) {
        this.mId_tg = mId_tg;
    }

    public String getmThoigian() {
        return mThoigian;
    }

    public void setmThoigian(String mThoigian) {
        this.mThoigian = mThoigian;
    }
    
}
