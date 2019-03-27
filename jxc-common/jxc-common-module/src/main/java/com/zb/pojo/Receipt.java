package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Receipt implements Serializable {
    //收款单ID
    private String id;
    //收款日期
    private String skTime;
    //金额
    private Float sum;
    //客户ID
    private String kh;
    //货币
    private Float money;
    //经手人ID
    private String jsr;
    //收款方式
    private String pay;
    //收款去向
    private String payaddress;
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
    public void setSum (Float  sum){
        this.sum=sum;
    }
    public  Float getSum(){
        return this.sum;
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
    public void setJsr (String  jsr){
        this.jsr=jsr;
    }
    public  String getJsr(){
        return this.jsr;
    }
    public void setPay (String  pay){
        this.pay=pay;
    }
    public  String getPay(){
        return this.pay;
    }
    public void setPayaddress (String  payaddress){
        this.payaddress=payaddress;
    }
    public  String getPayaddress(){
        return this.payaddress;
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
