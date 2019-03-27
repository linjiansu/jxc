package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Ar implements Serializable {
    //应收款ID
    private String id;
    //收款期限
    private String skTime;
    //发生日期
    private String fsTime;
    //客户ID
    private String kh;
    //货币
    private Float money;
    //应收金额
    private Float ysMoney;
    //已收金额
    private Float yshouMoney;
    //余额
    private Float balance;
    //销售/退货
    private String sd;
    //操作员ID
    private String op;
    //审核人ID
    private String shr;
    //备注
    private String note;
    //审核状态
    private String sh;
    //get set 方法
    public void setId (String  id){
        this.id=id;
    }
    public  String getId(){
        return this.id;
    }
    public void setSkTime (String  skTime){
        this.skTime=skTime;
    }
    public  String getSkTime(){
        return this.skTime;
    }
    public void setFsTime (String  fsTime){
        this.fsTime=fsTime;
    }
    public  String getFsTime(){
        return this.fsTime;
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
    public void setYsMoney (Float  ysMoney){
        this.ysMoney=ysMoney;
    }
    public  Float getYsMoney(){
        return this.ysMoney;
    }
    public void setYshouMoney (Float  yshouMoney){
        this.yshouMoney=yshouMoney;
    }
    public  Float getYshouMoney(){
        return this.yshouMoney;
    }
    public void setBalance (Float  balance){
        this.balance=balance;
    }
    public  Float getBalance(){
        return this.balance;
    }
    public void setSd (String  sd){
        this.sd=sd;
    }
    public  String getSd(){
        return this.sd;
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
    public void setNote (String  note){
        this.note=note;
    }
    public  String getNote(){
        return this.note;
    }
    public void setSh (String  sh){
        this.sh=sh;
    }
    public  String getSh(){
        return this.sh;
    }
}
