
package com.hou.hanoiguide.model;

/**
 * DD_Thoigian_hoatdong
 * Model class for 
 * 
 * @author NgocTan
 * Created on 06/02/15 - 4:06 pm
 * 
 
 */
public class DD_Thoigian_hoatdong {
    private String mId_tghoatdongDL;
    private String mId_diemDl;
    private String mId_tg;
    private String mId_thu;
    private String mMota;

    public DD_Thoigian_hoatdong() {
    }

    public DD_Thoigian_hoatdong(String mId_tghoatdongDL, String mId_diemDl,
                                String mId_tg, String mId_thu, String mMota) {
        this.mId_tghoatdongDL = mId_tghoatdongDL;
        this.mId_diemDl = mId_diemDl;
        this.mId_tg = mId_tg;
        this.mId_thu = mId_thu;
        this.mMota = mMota;
    }

    public String getmId_tghoatdongDL() {
        return mId_tghoatdongDL;
    }

    public void setmId_tghoatdongDL(String mId_tghoatdongDL) {
        this.mId_tghoatdongDL = mId_tghoatdongDL;
    }

    public String getmId_diemDl() {
        return mId_diemDl;
    }

    public void setmId_diemDl(String mId_diemDl) {
        this.mId_diemDl = mId_diemDl;
    }

    public String getmId_tg() {
        return mId_tg;
    }

    public void setmId_tg(String mId_tg) {
        this.mId_tg = mId_tg;
    }

    public String getmId_thu() {
        return mId_thu;
    }

    public void setmId_thu(String mId_thu) {
        this.mId_thu = mId_thu;
    }
      
    public String getmMota() {
        return mMota;
    }

    public void setmMota(String mMota) {
        this.mMota = mMota;
    }
    
}
