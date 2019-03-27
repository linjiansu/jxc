package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Goodback implements Serializable {
    //退货ID
    private String id;
    //退货日期
    private String backTime;
    //客户ID
    private String kh;
    //货币
    private Float money;
    //销售人ID
    private String sellId;
    //验收人ID
    private String ysr;
    //备注
    private String note;
    //操作员ID
    private String op;
    //审核人ID
    private String shr;
    //审核状态
    private String sh;
    //录入日期
    private String inTime;
    //审核日期
    private String shTime;
    //get set 方法
    public void setId (String  id){
        this.id=id;
    }
    public  String getId(){
        return this.id;
    }
    public void setBackTime (String  backTime){
        this.backTime=backTime;
    }
    public  String getBackTime(){
        return this.backTime;
    }
    public void setKh (String  kh){
        this.kh=kh;
    }
    public  String getKh(){
        return this.kh;
    }
    public void setMoney (Float  money){
        this.money=money;
    }
    public  Float getMoney(){
        return this.money;
    }
    public void setSellId (String  sellId){
        this.sellId=sellId;
    }
    public  String getSellId(){
        return this.sellId;
    }
    public void setYsr (String  ysr){
        this.ysr=ysr;
    }
    public  String getYsr(){
        return this.ysr;
    }
    public void setNote (String  note){
        this.note=note;
    }
    public  String getNote(){
        return this.note;
    }
    public void setOp (String  op){
        this.op=op;
    }
    public  String getOp(){
        return this.op;
    }
    public void setShr (String  shr){
        this.shr=shr;
    }
    public  String getShr(){
        return this.shr;
    }
    public void setSh (String  sh){
        this.sh=sh;
    }
    public  String getSh(){
        return this.sh;
    }
    public void setInTime (String  inTime){
        this.inTime=inTime;
    }
    public  String getInTime(){
        return this.inTime;
    }
    public void setShTime (String  shTime){
        this.shTime=shTime;
    }
    public  String getShTime(){
        return this.shTime;
    }
}
