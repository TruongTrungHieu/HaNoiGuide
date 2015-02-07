

package com.hou.hanoiguide.model;

/**
 * MS_Muasam_loai
 Model class for 
 Created on 06/02/15 - 4:06 pm 
 Edited on
 * @author NgocTan
 */
public class MS_Muasam_loai {
    private String mId_muasam;
    private String mId_dm_loaimuasam;
    private String mMota;

    public MS_Muasam_loai() {
    }

    public MS_Muasam_loai(String mId_muasam, String mId_dm_loaimuasam, String mMota) {
        this.mId_muasam = mId_muasam;
        this.mId_dm_loaimuasam = mId_dm_loaimuasam;
        this.mMota = mMota;
    }

    public String getmId_muasam() {
        return mId_muasam;
    }

    public void setmId_muasam(String mId_muasam) {
        this.mId_muasam = mId_muasam;
    }

    public String getmId_dm_loaimuasam() {
        return mId_dm_loaimuasam;
    }

    public void setmId_dm_loaimuasam(String mId_dm_loaimuasam) {
        this.mId_dm_loaimuasam = mId_dm_loaimuasam;
    }

    public String getmMota() {
        return mMota;
    }

    public void setmMota(String mMota) {
        this.mMota = mMota;
    }
    
    
}
