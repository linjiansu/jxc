package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Paiddetail implements Serializable {
    //
    private String paidDetailID;
    //
    private String paidID;
    //
    private String orderID;
    //
    private Double curPay;
    //get set 方法
    public void setPaidDetailID (String  paidDetailID){
        this.paidDetailID=paidDetailID;
    }
    public  String getPaidDetailID(){
        return this.paidDetailID;
    }
    public void setPaidID (String  paidID){
        this.paidID=paidID;
    }
    public  String getPaidID(){
        return this.paidID;
    }
    public void setOrderID (String  orderID){
        this.orderID=orderID;
    }
    public  String getOrderID(){
        return this.orderID;
    }
    public void setCurPay (Double  curPay){
        this.curPay=curPay;
    }
    public  Double getCurPay(){
        return this.curPay;
    }
}
