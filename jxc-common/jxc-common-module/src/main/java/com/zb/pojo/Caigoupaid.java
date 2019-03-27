package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Caigoupaid implements Serializable {
    //
    private String paidID;
    //
    private String payTime;
    //
    private Double money;
    //
    private String billID;
    //
    private String supplierID;
    //
    private String monetary;
    //
    private String payStyle;
    //
    private String payFrom;
    //
    private String operatorID;
    //
    private String examinerIID;
    //
    private String others;
    //
    private String examineState;
    //get set 方法
    public void setPaidID (String  paidID){
        this.paidID=paidID;
    }
    public  String getPaidID(){
        return this.paidID;
    }
    public void setPayTime (String  payTime){
        this.payTime=payTime;
    }
    public  String getPayTime(){
        return this.payTime;
    }
    public void setMoney (Double  money){
        this.money=money;
    }
    public  Double getMoney(){
        return this.money;
    }
    public void setBillID (String  billID){
        this.billID=billID;
    }
    public  String getBillID(){
        return this.billID;
    }
    public void setSupplierID (String  supplierID){
        this.supplierID=supplierID;
    }
    public  String getSupplierID(){
        return this.supplierID;
    }
    public void setMonetary (String  monetary){
        this.monetary=monetary;
    }
    public  String getMonetary(){
        return this.monetary;
    }
    public void setPayStyle (String  payStyle){
        this.payStyle=payStyle;
    }
    public  String getPayStyle(){
        return this.payStyle;
    }
    public void setPayFrom (String  payFrom){
        this.payFrom=payFrom;
    }
    public  String getPayFrom(){
        return this.payFrom;
    }
    public void setOperatorID (String  operatorID){
        this.operatorID=operatorID;
    }
    public  String getOperatorID(){
        return this.operatorID;
    }
    public void setExaminerIID (String  examinerIID){
        this.examinerIID=examinerIID;
    }
    public  String getExaminerIID(){
        return this.examinerIID;
    }
    public void setOthers (String  others){
        this.others=others;
    }
    public  String getOthers(){
        return this.others;
    }
    public void setExamineState (String  examineState){
        this.examineState=examineState;
    }
    public  String getExamineState(){
        return this.examineState;
    }
}
