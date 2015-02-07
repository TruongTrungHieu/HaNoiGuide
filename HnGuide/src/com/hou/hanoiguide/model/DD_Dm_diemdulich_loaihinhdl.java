
package com.hou.hanoiguide.model;

/**
 * DD_Dm_diemdulich_loaihinhdl
 * Model class for 
 * 
 * @author NgocTan
 * Created on 06/02/15 - 4:06 pm
 * 
 */
public class DD_Dm_diemdulich_loaihinhdl {
    private String mId_diemDL;
    private String mMaloaihinhDL;

    public DD_Dm_diemdulich_loaihinhdl() {
    }

    public DD_Dm_diemdulich_loaihinhdl(String mId_diemDL, String mMaloaihinhDL) {
        this.mId_diemDL = mId_diemDL;
        this.mMaloaihinhDL = mMaloaihinhDL;
    }

    public String getmId_diemDL() {
        return mId_diemDL;
    }

    public void setmId_diemDL(String mId_diemDL) {
        this.mId_diemDL = mId_diemDL;
    }

    public String getmMaloaihinhDL() {
        return mMaloaihinhDL;
    }

    public void setmMaloaihinhDL(String mMaloaihinhDL) {
        this.mMaloaihinhDL = mMaloaihinhDL;
    }
    
    
}
