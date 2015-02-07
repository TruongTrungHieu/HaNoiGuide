
package com.hou.hanoiguide.model;

/**
 * KS_Dichvu_khachsan
 Model class for 
 Created on 06/02/15 - 4:06 pm 
 Edited on
 * @author NgocTan
 */
public class KS_Dichvu_khachsan {
    private String mId_khachsan;
    private String mId_dm_dv;

    public KS_Dichvu_khachsan() {
    }

    public KS_Dichvu_khachsan(String mId_khachsan, String mId_dm_dv) {
        this.mId_khachsan = mId_khachsan;
        this.mId_dm_dv = mId_dm_dv;
    }

    public String getmId_khachsan() {
        return mId_khachsan;
    }

    public void setmId_khachsan(String mId_khachsan) {
        this.mId_khachsan = mId_khachsan;
    }

    public String getmId_dm_dv() {
        return mId_dm_dv;
    }

    public void setmId_dm_dv(String mId_dm_dv) {
        this.mId_dm_dv = mId_dm_dv;
    }
    
    
}
