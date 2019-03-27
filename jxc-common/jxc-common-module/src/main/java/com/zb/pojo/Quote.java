package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Quote implements Serializable {
    //报价单单号
    private String id;
    //报价日期
    private String qDate;
    //客户ID
    private String kh;
    //报价人ID
    private String bjr;
    //货币
    private Float money;
    //操作员ID
    private String op;
    //备注
    private String note;
    //get set 方法
    public void setId (String  id){
        this.id=id;
    }
    public  String getId(){
        return this.id;
    }
    public void setQDate (String  qDate){
        this.qDate=qDate;
    }
    public  String getQDate(){
        return this.qDate;
    }
    public void setKh (String  kh){
        this.kh=kh;
    }
    public  String getKh(){
        return this.kh;
    }
    public void setBjr (String  bjr){
        this.bjr=bjr;
    }
    public  String getBjr(){
        return this.bjr;
    }
    public void setMoney (Float  money){
        this.money=money;
    }
    public  Float getMoney(){
        return this.money;
    }
    public void setOp (String  op){
        this.op=op;
    }
    public  String getOp(){
        return this.op;
    }
    public void setNote (String  note){
        this.note=note;
    }
    public  String getNote(){
        return this.note;
    }
}
