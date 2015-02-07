

package com.hou.hanoiguide.model;

/**
 * MS_Khuyenmai
 Model class for 
 Created on 06/02/15 - 4:06 pm 
 Edited on
 * @author NgocTan
 */
public class MS_Khuyenmai {
    private String mId_sale;
    private String mId_muasam;
    private String mId_dm_sale;
    private String mTg_batdau;
    private String mTg_ketthuc;
    private String mMota;

    public MS_Khuyenmai() {
    }

    public MS_Khuyenmai(String mId_sale, String mId_muasam, String mId_dm_sale, String mTg_batdau, String mTg_ketthuc, String mMota) {
        this.mId_sale = mId_sale;
        this.mId_muasam = mId_muasam;
        this.mId_dm_sale = mId_dm_sale;
        this.mTg_batdau = mTg_batdau;
        this.mTg_ketthuc = mTg_ketthuc;
        this.mMota = mMota;
    }

    public String getmId_sale() {
        return mId_sale;
    }

    public void setmId_sale(String mId_sale) {
        this.mId_sale = mId_sale;
    }

    public String getmId_muasam() {
        return mId_muasam;
    }

    public void setmId_muasam(String mId_muasam) {
        this.mId_muasam = mId_muasam;
    }

    public String getmId_dm_sale() {
        return mId_dm_sale;
    }

    public void setmId_dm_sale(String mId_dm_sale) {
        this.mId_dm_sale = mId_dm_sale;
    }

    public String getmTg_batdau() {
        return mTg_batdau;
    }

    public void setmTg_batdau(String mTg_batdau) {
        this.mTg_batdau = mTg_batdau;
    }

    public String getmTg_ketthuc() {
        return mTg_ketthuc;
    }

    public void setmTg_ketthuc(String mTg_ketthuc) {
        this.mTg_ketthuc = mTg_ketthuc;
    }

    public String getmMota() {
        return mMota;
    }

    public void setmMota(String mMota) {
        this.mMota = mMota;
    }
    
    
}
