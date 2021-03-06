package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   å¥åºå
*/
public class Inbill implements Serializable {
    //入库单编号
    private String billId;
    //入库日期
    private String date;
    //审核员
    private String checker;
    //经手人
    private String issuer;
    //收货仓库
    private String receiveck;
    //审核
    private String check;
    //审核日期
    private String checkdate;
    //get set 方法
    public void setBillId (String  billId){
        this.billId=billId;
    }
    public  String getBillId(){
        return this.billId;
    }
    public void setDate (String  date){
        this.date=date;
    }
    public  String getDate(){
        return this.date;
    }
    public void setChecker (String  checker){
        this.checker=checker;
    }
    public  String getChecker(){
        return this.checker;
    }
    public void setIssuer (String  issuer){
        this.issuer=issuer;
    }
    public  String getIssuer(){
        return this.issuer;
    }
    public void setReceiveck (String  receiveck){
        this.receiveck=receiveck;
    }
    public  String getReceiveck(){
        return this.receiveck;
    }
    public void setCheck (String  check){
        this.check=check;
    }
    public  String getCheck(){
        return this.check;
    }
    public void setCheckdate (String  checkdate){
        this.checkdate=checkdate;
    }
    public  String getCheckdate(){
        return this.checkdate;
    }
}
