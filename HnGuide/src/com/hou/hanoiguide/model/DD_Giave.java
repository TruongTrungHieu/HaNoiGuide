
package com.hou.hanoiguide.model;

/**
 * DD_Dm_Giave
 * Model class for 
 * 
 * @author NgocTan
 * Created on 06/02/15 - 4:06 pm
 * 
 */
public class DD_Giave {
    private String mId_giave;
    private String mId_loaive;
    private String mGia;
    private String mId_diemdulich;
    private String mMota;

    public DD_Giave() {
    }

    public DD_Giave(String mId_giave, String mId_loaive, String mGia, String mId_diemdulich, String mMota) {
        this.mId_giave = mId_giave;
        this.mId_loaive = mId_loaive;
        this.mGia = mGia;
        this.mId_diemdulich = mId_diemdulich;
        this.mMota = mMota;
    }

    public String getmId_giave() {
        return mId_giave;
    }

    public void setmId_giave(String mId_giave) {
        this.mId_giave = mId_giave;
    }

    public String getmId_loaive() {
        return mId_loaive;
    }

    public void setmId_loaive(String mId_loaive) {
        this.mId_loaive = mId_loaive;
    }

    public String getmGia() {
        return mGia;
    }

    public void setmGia(String mGia) {
        this.mGia = mGia;
    }

    public String getmId_diemdulich() {
        return mId_diemdulich;
    }

    public void setmId_diemdulich(String mId_diemdulich) {
        this.mId_diemdulich = mId_diemdulich;
    }

    public String getmMota() {
        return mMota;
    }

    public void setmMota(String mMota) {
        this.mMota = mMota;
    }
    
    
}
