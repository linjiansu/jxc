package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   ä»åºè¡¨
*/
public class Ckinfo implements Serializable {
    //仓库编号
    private String ckId;
    //仓库名称
    private String ckname;
    //负责人
    private String chargeid;
    //get set 方法
    public void setCkId (String  ckId){
        this.ckId=ckId;
    }
    public  String getCkId(){
        return this.ckId;
    }
    public void setCkname (String  ckname){
        this.ckname=ckname;
    }
    public  String getCkname(){
        return this.ckname;
    }
    public void setChargeid (String  chargeid){
        this.chargeid=chargeid;
    }
    public  String getChargeid(){
        return this.chargeid;
    }
}
