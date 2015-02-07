
package com.hou.hanoiguide.model;

/**
 * MS_Dm_khuyenmai
 Model class for 
 Created on 06/02/15 - 4:06 pm 
 Edited on
 * @author NgocTan
 */
public class MS_Dm_khuyenmai {
    private String mId_dm_sale;
    private String mTen_dm_sale;
    private String mMota;

    public MS_Dm_khuyenmai() {
    }

    public MS_Dm_khuyenmai(String mId_dm_sale, String mTen_dm_sale, String mMota) {
        this.mId_dm_sale = mId_dm_sale;
        this.mTen_dm_sale = mTen_dm_sale;
        this.mMota = mMota;
    }

    public String getmId_dm_sale() {
        return mId_dm_sale;
    }

    public void setmId_dm_sale(String mId_dm_sale) {
        this.mId_dm_sale = mId_dm_sale;
    }

    public String getmTen_dm_sale() {
        return mTen_dm_sale;
    }

    public void setmTen_dm_sale(String mTen_dm_sale) {
        this.mTen_dm_sale = mTen_dm_sale;
    }

    public String getmMota() {
        return mMota;
    }

    public void setmMota(String mMota) {
        this.mMota = mMota;
    }
    
    
}
