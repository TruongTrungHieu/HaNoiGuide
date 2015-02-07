
package com.hou.hanoiguide.model;

/**
 * MS_Dm_loaimuasam
 Model class for 
 Created on 06/02/15 - 4:06 pm 
 Edited on
 * @author NgocTan
 */
public class MS_Dm_loaimuasam {
    private String mId_dm_loaimuasam;
    private String mTem_dm_loaimuasam;
    private String mMota;

    public MS_Dm_loaimuasam() {
    }

    public MS_Dm_loaimuasam(String mId_dm_loaimuasam, String mTem_dm_loaimuasam, String mMota) {
        this.mId_dm_loaimuasam = mId_dm_loaimuasam;
        this.mTem_dm_loaimuasam = mTem_dm_loaimuasam;
        this.mMota = mMota;
    }

    public String getmId_dm_loaimuasam() {
        return mId_dm_loaimuasam;
    }

    public void setmId_dm_loaimuasam(String mId_dm_loaimuasam) {
        this.mId_dm_loaimuasam = mId_dm_loaimuasam;
    }

    public String getmTem_dm_loaimuasam() {
        return mTem_dm_loaimuasam;
    }

    public void setmTem_dm_loaimuasam(String mTem_dm_loaimuasam) {
        this.mTem_dm_loaimuasam = mTem_dm_loaimuasam;
    }

    public String getmMota() {
        return mMota;
    }

    public void setmMota(String mMota) {
        this.mMota = mMota;
    }
    
    
}
